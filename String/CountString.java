public class CountString {
        public static void main(String[] args) {
            String str = "Java Programming";
            int count = 0;
            for (char ch : str.toLowerCase().toCharArray()) {
                if ("aeiou".indexOf(ch) != -1) {
                    count++;
                }
            }
            System.out.println("String: " + str);
            System.out.println("Vowel Count: " + count);
        }
    }
    
    


