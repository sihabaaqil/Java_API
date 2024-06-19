package test;

public class Second_Largest_Array {

	public static void main(String[] args) {
		int[] numbers = { 10, 24, 55, 68, 35, 89, 70, 45 };

		// Call the method to find the second largest number
		int secondLargestNumber = findSecondLargestNumber(numbers);

		// Print the second largest number
		System.out.println("The second largest number in the array is: " + secondLargestNumber);
	}

	public static int findSecondLargestNumber(int[] array) {
		// Check if the array has less than 2 elements
		if (array == null || array.length < 2) {
			throw new IllegalArgumentException("Array must contain at least two elements");
		}

		// Initialize the largest and second largest numbers
		int largest = Integer.MIN_VALUE; // 0;
		int secondLargest = Integer.MIN_VALUE;

		System.out.println("" + largest + secondLargest);

		// Loop through the array to find the largest and second largest numbers
		for (int num : array) {
			if (num > largest) {
				secondLargest = largest;
				largest = num;
			} else if (num > secondLargest && num != largest) {
				secondLargest = num;
			}
		}

		return secondLargest;
	}

}
