import java.util.HashMap;
import java.util.Map;

public class Loki {

    public static void main(String[] args) {
        int[] Die_A = {1, 2, 3, 4, 5, 6};
        int[] Die_B = {1, 2, 3, 4, 5, 6};

        int[] newDieA = undoomDice(Die_A, Die_B);
        int[] newDieB = Die_B;

        System.out.println("New Die A:");
        for (int value : newDieA) {
            System.out.print(value + " ");
        }
        System.out.println("\nNew Die B:");
        for (int value : newDieB) {
            System.out.print(value + " ");
        }
    }

    public static int[] undoomDice(int[] Die_A, int[] Die_B) {
        Map<Integer, Integer> originalProbabilities = calculateProbabilities(Die_A, Die_B);
        int[] newDieA = {1, 2, 3, 4, 1, 2}; 
        Map<Integer, Integer> newProbabilities = calculateProbabilities(newDieA, Die_B);

        double scalingFactor = calculateScalingFactor(originalProbabilities, newProbabilities);

        
        for (int key : newProbabilities.keySet()) {
            newProbabilities.put(key, (int) (newProbabilities.get(key) * scalingFactor));
        }

        return newDieA;
    }

    public static Map<Integer, Integer> calculateProbabilities(int[] Die_A, int[] Die_B) {
        Map<Integer, Integer> probabilities = new HashMap<>();
        for (int a : Die_A) {
            for (int b : Die_B) {
                int sum = a + b;
                probabilities.put(sum, probabilities.getOrDefault(sum, 0) + 1);
            }
        }
        return probabilities;
    }

    public static double calculateScalingFactor(Map<Integer, Integer> originalProbabilities, Map<Integer, Integer> newProbabilities) {
        int originalTotal = originalProbabilities.values().stream().mapToInt(Integer::intValue).sum();
        int newTotal = newProbabilities.values().stream().mapToInt(Integer::intValue).sum();
        return (double) originalTotal / newTotal;
    }
}
