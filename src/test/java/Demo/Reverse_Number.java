package Demo;

public class Reverse_Number {

	public static void main(String[] args) {
		int n = 123456789;
		int d, r = 0;
		while (n != 0) {
			d = n % 10;
			r = r * 10 + d;
			n /= 10;
		}
		System.out.println(r);
	}
}
