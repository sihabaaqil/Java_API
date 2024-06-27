package Demo;

public class Reverse_String {

	public static void main(String[] args) {
		String str = "Home", nstr = "";
		char ch;
		// System.out.println("Reverse : " + reverse(str));
		for (int i = 0; i < str.length(); i++) {
			// ch = str.charAt(i); // extracts each character
			nstr = str.charAt(i) + nstr; // adds each character in front of the existing string
		}
		System.out.println("Reverse : " + nstr);

	}

	public static String reverse(String str) {
		String op = "";
		StringBuilder input1 = new StringBuilder();
		input1.append(str);
		input1.reverse();
		op = input1.toString();
		return op;
	}

}
