package cw180629.task1;

/* 1. Найти все 4х-значные простые числа.
        Посчитать их количество
*/

import java.util.Set;
import java.util.TreeSet;

public class SimpleValidator {

    private Set<Integer> simples = new TreeSet<>();

    private boolean is4Digit(int digit) {
        return 4 == Math.floor(Math.log(digit) / Math.log(10)) + 1;
    }

    public boolean isSimple(Integer digit) {
        if (simples.contains(digit)) return true;
        return getSimples(digit);
    }

    private boolean getSimples(Integer digit) {
        if (!is4Digit(digit)){
            return false;
        }
        for (int i = 2; i < digit; i++) {
                if (digit % i == 0) {
                    return false;
                }
        }
        this.simples.add(digit);
        return true;
    }
}
