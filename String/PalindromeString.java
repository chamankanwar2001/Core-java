public class PalindromeString {
        public static void main(String[] args) {
            String str = "chaman";
            String rev = new StringBuilder(str).reverse().toString();
            if (str.equals(rev)) {
                System.out.println(str + " is a Palindrome");
            } else {
                System.out.println(str + " is not a Palindrome");
            }
        }
    }
    
    
