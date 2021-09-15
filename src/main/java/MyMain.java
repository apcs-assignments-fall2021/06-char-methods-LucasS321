public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        if (!(ch <= 'Z' && ch >= 'A')) {
            return ch;
        }
        int a = ch - ('Z'-'z');
        // REPLACE WITH YOUR CODE
        return (char) a;
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not a lowercase letter,
    // it is returned unchanged.
    public static char toUpper(char ch) {
        if (!(ch <= 'z' && ch >= 'a')) {
            return ch;
        }
        int a = ch + ('Z'-'z');
        // REPLACE WITH YOUR CODE
        return (char) a;
    }

    // The method is given a String as input and returns a
    // new String where all of the numbers have been removed
    // from the original String.
    public static String removeNumbers(String str) {
        String newstr = "";
        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) <= '9' && str.charAt(i) >= '0')) {
                newstr = newstr+str.charAt(i);
            }
        }
        // REPLACE WITH YOUR CODE
        return newstr;
    }

    // Write some code to test your methods!
    public static void main(String[] args) {
        // ADD SOME TESTING CODE HERE
        System.out.println(toLower('A'));
        System.out.println(toUpper('z'));
        System.out.println(removeNumbers("asdfljaksdfZ324SDf"));
    }
}
