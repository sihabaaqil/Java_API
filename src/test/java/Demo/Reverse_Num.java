package Demo;

public class Reverse_Num {

	public static void main(String[] args) {
		int number = 109989;

		int rever = 0;
		while (number != 0) {
			int digit = number % 10;
			rever = rever * 10 + digit;
			number /= 10;
		}

		System.out.println("" + rever);
	}

}
