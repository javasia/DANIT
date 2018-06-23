package intervals;

import java.util.*;

public class Intervals {
    static class Pair {
        private int start;
        private int end;

        public Pair(int start, int end){
            this.start = start;
            this.end = end;
        }

        public String toString (){
            return String.format("%d %d", start, end);
        }
    }

    public static void main(String... args) {
        Scanner in;
        if (args.length > 0){
            in = new Scanner(args[0]);
        }else {
            in = new Scanner(System.in);
        }
        int N = in.nextInt();

        Set<Pair> inputData = new TreeSet<>((e1, e2) -> {
            return e1.start == e2.start ? e1.end - e2.end : e1.start - e2.start;
        });

        while (N-- > 0){
            int start = in.nextInt();
            int end = in.nextInt();
            inputData.add(new Pair(start, end));
        }

        Deque<Pair> merged = new ArrayDeque<>();
        inputData.forEach(e -> addMerging(e, merged));
     //   merged.forEach(System.out::println);
    }

    private static void addMerging(Pair el, Deque<Pair> dest){
        Pair tail = dest.peekLast();
        if (areIntersecting (tail, el)){
            if (!isAbsorbtion(tail, el)){
                dest.remove(tail);
                dest.addLast(merge(tail, el));
            }
        }else{
            dest.addLast(el);
        }
    }

    private static boolean areIntersecting (Pair e1, Pair e2){
        return e1 != null && e2 != null && e1.end >= e2.start;
    }

    private static boolean isAbsorbtion (Pair e1, Pair e2){
        return e1.end >= e2.end;
    }


    private static Pair merge (Pair e1, Pair e2){
        int start = Math.min(e1.start, e2.start);
        int end = Math.max (e1.end, e2.end);
        return new Pair(start, end);
    }

}