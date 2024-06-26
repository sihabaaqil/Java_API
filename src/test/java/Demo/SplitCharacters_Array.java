package Demo;

public class SplitCharacters_Array {

	public static void main(String[] args) {
		String[] stringArray = { "hello", "world", "java", "program" };
		String stringArray2[] = { "hello", "world", "java", "program" };

		for (String arr : stringArray) {
			char[] ch = arr.toCharArray();
			for (char chr : ch) {
				System.out.print(chr);
			}
		}

//		for (int i = 0; i < stringArray2.length; i++) {
//			char[] ch = stringArray2[i].toCharArray();
//			for (char chr : ch) {
//				System.out.println(chr);
//			}
//
//		}
	}

}
