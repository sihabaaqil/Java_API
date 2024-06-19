package Demo;

public class Word_Count {

    public static void main(String[] args) {

        System.out.println(countWordsUsingRegex(" "));
    }


    public static int countWordsUsingRegex(String arg) {
        if (arg == null) {
            return 0;
        }
        final String[] words = arg.split("[\\pP\\s&&[^’]]");
        return words.length;
    }
}
