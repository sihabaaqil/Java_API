package Demo;

import java.util.HashMap;
import java.util.Map;

public class NumberManipulation {

	public static void main(String[] args) {
		int startDecrease = 10;
		int endDecrease = 1;
		int startIncrease = 1;
		int endIncrease = 10;
		HashMap<Integer, Integer> map = new HashMap<>();

		// Add key-value pairs to the HashMap
		// map.put("Apple", 10);

		System.out.println("Decreasing sequence:");
		for (int i = startDecrease; i >= endDecrease; i--) {
			System.out.print(i + " ");
			map.put(i, i);
		}
		System.out.println(); // Print a newline for separation

		System.out.println("Increasing sequence:");
		for (int i = startIncrease; i <= endIncrease; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}

	}

	public static int[] addValue(int[] originalArray, int newValue) {
		// Create a new array with a size one greater than the original array
		int[] updatedArray = new int[originalArray.length + 1];

		// Copy the original array to the new array
		System.arraycopy(originalArray, 0, updatedArray, 0, originalArray.length);

		// Add the new value to the last position of the new array
		updatedArray[originalArray.length] = newValue;

		return updatedArray;
	}

}
