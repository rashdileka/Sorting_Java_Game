import java.util.Scanner;

public class SortingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] unsortedArray = { 5, 2, 9, 1, 5, 6 };
        int[] sortedArray = { 1, 2, 5, 5, 6, 9 };

        System.out.println("Welcome to the Sorting Game!");
        System.out.println("Your task is to sort the following array in ascending order:");
        printArray(unsortedArray);

        boolean hasSorted = false;
        int[] userArray = new int[unsortedArray.length];

        while (!hasSorted) {
            System.out.println("Enter your sorted array (space-separated): ");
            for (int i = 0; i < userArray.length; i++) {
                userArray[i] = scanner.nextInt();
            }

            if (isArraySorted(userArray)) {
                hasSorted = true;
            } else {
                System.out.println("The array is not sorted correctly. Try again.");
            }
        }

        System.out.println("Congratulations! You've sorted the array correctly.");
        scanner.close();
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static boolean isArraySorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
