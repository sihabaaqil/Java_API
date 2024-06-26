package Demo;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Hello World!";
		String Reversed = null;
//		StringBuilder sb = new StringBuilder(str);
//		String Reversed = sb.reverse().toString();
//		System.out.println("Original:" + str);
//		System.out.println("Reversed:" + Reversed);

		for (int i = 0; i < str.length(); i++) {
			Reversed = str.charAt(i) + Reversed;
		}

		System.out.println("Reversed:" + Reversed);

	}

}
