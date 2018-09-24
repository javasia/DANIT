package cw16092018.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmartStringGenerator {
    private final static char DEFAULT_MIN = 'a';
    private final static char DEFAULT_MAX = 'b';

   private final List<Range> ranges;

    int a;
    int b;


    public SmartStringGenerator(int a, int b) {
        this.a = a;
        this.b = b;
        ranges = Collections.unmodifiableList(Arrays.asList(new Range()));
    }

    public SmartStringGenerator() {
        this(DEFAULT_MIN, DEFAULT_MAX);
    }

    public String generateString (int minLength, int maxLength){
        StringBuilder sb = new StringBuilder();
        int len = new SmartIntegerGenerator().getOne(minLength, maxLength);
        for (int i = 1; i < len; i++) {
            char one = (char) new SmartIntegerGenerator().getOne('a', 'z');
            sb.append(one);
        }
        return sb.toString();
    }
}
