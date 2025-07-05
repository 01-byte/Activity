import java.util.Arrays;

public class CumulativeSum {

    public static int[] calculateCumulativeSum(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0]; // Return an empty array for empty or null input
        }

        int[] cumulativeSums = new int[arr.length];
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i]; // Add the current element to the running sum
            cumulativeSums[i] = currentSum; // Store the cumulative sum at the current index
        }

        return cumulativeSums;
    }

    public static void main(String[] args) {
        int[] originalArray = {100,6,55};
        int[] result = calculateCumulativeSum(originalArray);

        System.out.print("Original Array: ");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        int s = 0 ; 
        System.out.print("Cumulative Sum: ");
        for (int sum : result) {
            System.out.print(sum + " ");
        }

        int sums = Arrays.stream(result).sum();

        System.out.println("The sum of array elements is: " + sums);
        System.out.println();
    }
}