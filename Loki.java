import java.util.HashMap;
import java.util.Map;

public class Loki {

    public static Map<Integer, Double> calculateProbabilities(int[] die) {
        Map<Integer, Integer> probabilities = new HashMap<>();
        for (int i : die) {
            for (int j : die) {
                int total = i + j;
                probabilities.put(total, probabilities.getOrDefault(total, 0) + 1);
            }
        }
        int totalOutcomes = die.length * die.length;
        Map<Integer, Double> result = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : probabilities.entrySet()) {
            result.put(entry.getKey(), entry.getValue() / (double) totalOutcomes);
        }
        return result;
    }

    public static double[][] transformDice(int[] dieA, int[] dieB) {
        Map<Integer, Double> probabilitiesA = calculateProbabilities(dieA);
        Map<Integer, Double> probabilitiesB = calculateProbabilities(dieB);
        System.out.println(probabilitiesA.get(11) * 2);;
        double[] newDieA = new double[6];
        double[] newDieB = new double[6];

        for (int faceB : dieB) {
            double faceA = 0;
            for (Map.Entry<Integer, Double> entry : probabilitiesA.entrySet()) {
                int x = entry.getKey();
                double probA = entry.getValue();
                faceA += probA * countOccurrences(newDieA, sum(faceB) - x);
              
            }
            newDieB[faceB - 1] = (int) faceA;
        }

        for (int i = 0; i < 6; i++) {
            int numSpots = countOccurrences(newDieB, i + 1);
            if (numSpots > 4) {
                int excessSpots = numSpots - 4;
                for (int j = 0; j < excessSpots; j++) {
                    removeElement(newDieB, i + 1);
                    int index = indexOf(newDieA, i + 1);
                    if (index != -1) {
                        newDieA[index] = i + 2;
                    }
                }
            }
        }

        return new double[][]{newDieA, newDieB};
    }

    public static int countOccurrences(double[] newDieB, int target) {
        int count = 0;
        for (double num : newDieB) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }

    public static void removeElement(double[] arr, int target) {
        int index = indexOf(arr, target);
        if (index != -1) {
            for (int i = index; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = 0;
        }
    }

    public static int indexOf(double[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static int sum(int... a){
        int s = 0;
        for(int i : a){
            s += i;
        }
        return s;
    }

    public static void main(String[] args) {
        int[] dieA = {1, 2, 3, 4, 5, 6};
        int[] dieB = {1, 2, 3, 4, 5, 6};
        double[][] newDice = transformDice(dieA, dieB);
        System.out.println("New Die A: " + java.util.Arrays.toString(newDice[0]));
        System.out.println("New Die B: " + java.util.Arrays.toString(newDice[1]));
    }
}
