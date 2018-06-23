package intervals;

import java.util.*;

public class IntervalsOptimized {
    private static TreeMap<Integer, Integer> inputData;
    public static void main(String... args) {
        Scanner in;
        if (args.length > 0){
            in = new Scanner(args[0]);
        }else {
            in = new Scanner(System.in);
        }
        int N = in.nextInt();
        inputData = new TreeMap<>((e1, e2) -> e1 - e2);
        while (N-- > 0) {
            int start = in.nextInt();
            int end = in.nextInt();
            if (!inputData.containsKey(start)) {
                inputData.put(start, end);
            } else if (inputData.get(start) < end) {
                inputData.replace(start, end);
            }
        }
       // System.out.printf("%d items collected\n", inputData.size());
        prepareData();
      //  System.out.printf("%d items left after preparation\n", inputData.size());
        //merge();
      //  System.out.println("Done!");
        StringBuilder result = new StringBuilder(inputData.size()*2*35);
        merge().forEach((key, value) -> result.append(String.format("%d %d\n", key, value)));
     //   System.out.println(result);
    }

    private static void  prepareData(){
        Integer key = inputData.firstKey();
        while(key != null){
            while (canBeAbsorbed(key, inputData.get(key))){
                inputData.remove(inputData.higherEntry(key).getKey());
            }
            key = inputData.higherKey(key);
        }
    }

    private static boolean canBeAbsorbed(int start, int end) {
        return inputData.higherKey(start) != null
                && inputData.higherEntry(start).getValue() < end;
    }

    public static TreeMap<Integer, Integer> merge() {
        TreeMap<Integer, Integer> merged = new TreeMap<Integer, Integer>();
        Integer startKey = inputData.firstKey();
        while (startKey != null) {
            Integer endDiapasone = getClosingKey(inputData, startKey);
            merged.put(startKey, endDiapasone);
            startKey = inputData.higherKey(endDiapasone);
        }
        return merged;
    }


//   public static String merge() {
//       StringBuilder result = new StringBuilder();
//       Integer startKey = inputData.firstKey();
//       while (startKey != null) {
//           Integer endValue = getClosingKey(inputData, startKey);
//           result.append(String.format("%d %d\n", startKey, endValue));
//           startKey = inputData.higherKey(endValue);
//       }
//       return result.toString();
//   }

    private static Integer getClosingKey(TreeMap<Integer, Integer> diapasons, Integer startKey) {
        diapasons = new TreeMap(diapasons.tailMap(startKey));
        Integer closingKey = diapasons.firstEntry().getValue();
        if (diapasons.size() > 1) {
            if (diapasons.containsKey(closingKey)) {
                return getClosingKey(diapasons, closingKey);
            } else {
                Map.Entry<Integer, Integer> next = diapasons.floorEntry(closingKey);
                if (next != null) {
                    closingKey = next.getValue();
                }
            }
        }
        return closingKey;
    }

}