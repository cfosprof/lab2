/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package okay;

import java.util.ArrayList;
import java.util.Random;

public class Library {

    public static ArrayList<Integer> roll(int n) {
        ArrayList<Integer> rolls = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            rolls.add(rand.nextInt(6) + 1);
        }
        return rolls;
    }

    public static boolean containsDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static double calculateAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }

    public static int[] getLowestAverageArray(int[][] arr) {
        double minAvg = Double.MAX_VALUE;
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            double avg = calculateAverage(arr[i]);
            if (avg < minAvg) {
                minAvg = avg;
                minIndex = i;
            }
        }
        return arr[minIndex];
    }
}
