package Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class Array_Merge {

	public static void main(String[] args) {
		int[] firstArray = { 23, 45, 12, 78, 4, 90, 1, 2 }; // source array
		int[] secondArray = { 77, 11, 45, 88, 32, 56, 3, 1, 2 }; // destination array
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < firstArray.length; i++)
			set.add(firstArray[i]);
		for (int i = 0; i < secondArray.length; i++)
			set.add(secondArray[i]);
		ArrayList<Integer> array = new ArrayList<>(set);
		Collections.sort(array);
		System.out.print(array);
	}

//	int fal = firstArray.length; // determines length of firstArray
//	int sal = secondArray.length; // determines length of secondArray
//	int[] result = new int[fal + sal]; // resultant array of size first array and second array
//	System.arraycopy(firstArray, 0, result, 0, fal);
//	System.arraycopy(secondArray, 0, result, fal, sal);
//	removeDuplicates(result);
	// System.out.println(Arrays.toString(result));

	public static void removeDuplicates(int[] a) {
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		// adding elements to LinkedHashSet
		for (int i = 0; i < a.length; i++)
			set.add(a[i]);
		// Print the elements of LinkedHashSet
		System.out.print(set);
	}

}
