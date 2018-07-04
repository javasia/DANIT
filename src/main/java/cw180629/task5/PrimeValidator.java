package cw180629.task5;

import java.util.TreeSet;

public class PrimeValidator {

    private TreeSet<Integer> simples = new TreeSet<>();

    public PrimeValidator(int digit) {
        this();
        isSimple(digit);
    }

    public PrimeValidator() {
        simples.add(2);
    }

    public boolean isSimple(Integer digit) {
        if (digit <= simples.last()) {
            return simples.contains(digit);
        }
        return checkSimples(digit);
    }

    private boolean checkSimples(Integer digit) {
        if (digit == 1) {
            return true;
        }

        for (Integer i = simples.first(); i != null; i = simples.higher(i)) {
            if (digit % i == 0) {
                return false;
            }
        }

        for (int i = simples.last(); i < digit; i++) {
            if (digit % i == 0) {
                return false;
            }
        }

        this.simples.add(digit);
        return true;
    }

    public TreeSet<Integer> getSimples() {
        return new TreeSet<Integer>() {{
            add(1);
            addAll(PrimeValidator.this.simples);
        }};
    }
}