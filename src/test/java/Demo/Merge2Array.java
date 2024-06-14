package Demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Merge2Array {

    public static void main(String[] args) {

        System.out.println("Test");

        int[] array1 = {1, 3, 5, 7, 9};
        int[] array2 = {2, 3, 5, 7, 10};

        int[] mergedArray = mergeAndRemoveDuplicates(array1, array2);

        System.out.println("Merged array without duplicates: " + Arrays.toString(mergedArray));
    }

    public static int[] mergeAndRemoveDuplicates(int[] array1, int[] array2) {
        // Use a HashSet to store unique elements
        Set<Integer> set = new HashSet<>();

        // Add elements from the first array
        for (int num : array1) {
            set.add(num);
        }

        // Add elements from the second array
        for (int num : array2) {
            set.add(num);
        }

        // Convert the set back to an array
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }

        return result;

    }

}
