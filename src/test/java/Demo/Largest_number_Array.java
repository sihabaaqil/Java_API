package Demo;

public class Largest_number_Array {

	public static void main(String[] args) {
		int[] numbers = {10, 24, 55, 68, 35, 89, 70, 45};

        // Call the method to find the largest number
        int largestNumber = findLargestNumber(numbers);

        // Print the largest number
        System.out.println("The largest number in the array is: " + largestNumber);


	}

	private static int findLargestNumber(int[] arr) {
		if (arr == null || arr.length == 0) {
			throw new IllegalArgumentException("Array should not be empty");
		}
		
		int largest = arr[0];
		for(int num : arr) {
			if(num > largest) {
				largest = num;
			}
		}
		return largest;
	}

	
	// condenser
}
