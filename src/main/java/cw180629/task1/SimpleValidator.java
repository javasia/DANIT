package cw180629.task1;

/* 1. Найти все 4х-значные простые числа.
        Посчитать их количество
*/

import java.util.Set;
import java.util.TreeSet;

public class SimpleValidator {

    private Set<Integer> simples = new TreeSet<>();

    public SimpleValidator(Integer digit) {
        getSimples(digit);
    }

    private boolean is4Digit(int digit) {
        return 4 == Math.floor(Math.log(digit) / Math.log(10)) + 1;
    }

    private boolean isSimple(Integer digit) {
        if (simples.contains(digit)) return true;
        return getSimples(digit);
    }

    private boolean getSimples(Integer digit) {
        for (int i = 999; i < digit; i++) {
            if (is4Digit(i)) {
                if (digit % i == 0) {
                    return false;
                }
            }
        }
        this.simples.add(digit);
        return true;
    }

    public int getCount(){
        return this.simples.size();
    }
}
