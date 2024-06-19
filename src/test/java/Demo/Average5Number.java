package Demo;

import java.util.Scanner;

public class Average5Number {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] number = new double[5];
        System.out.println("Enter 5 Number :");
        for (int i = 0; i < 5; i++) {
            System.out.println("Number" + (i + 1) + ":");
            number[i] = scanner.nextDouble();
        }
        double sum = 0;
        for (double num : number) {
            sum += num;
        }
        double average = sum / 5;
        System.out.println("Average number is " + average);
        scanner.close();
//		Scanner scanner = new Scanner(System.in);
//		// Array to store the five numbers
//		double[] numbers = new double[5];
//		// Prompt the user to enter five numbers
//		System.out.println("Enter five numbers:");
//		// Loop to read the five numbers from the user
//		for (int i = 0; i < 5; i++) {
//			System.out.print("Number " + (i + 1) + ": ");
//			numbers[i] = scanner.nextDouble();
//		}
//		// Calculate the average
//		double sum = 0;
//		for (double num : numbers) {
//			sum += num;
//		}
//		double average = sum / 5;
//		// Print the average
//		System.out.println("The average of the five numbers is: " + average);
//		//10 5 3 3 2 > 4.6
//		scanner.close();
    }

}
