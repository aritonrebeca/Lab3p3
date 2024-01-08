import java.util.Scanner;
public class Palindrom {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Introduceti un cuvant pentru a verifica daca este palindrom: ");
            String word = scanner.nextLine();

            if (isPalindrome(word)) {
                System.out.println("'" + word + "' este un cuvant palindrom.");
            } else {
                System.out.println("'" + word + "' nu este un cuvant palindrom.");
            }
        }

        private static boolean isPalindrome(String str) {
            str = str.toLowerCase(); // convertim cuvântul la litere mici pentru a evita diferențele de caz
            int start = 0;
            int end = str.length() - 1;

            while (start < end) {
                if (str.charAt(start) != str.charAt(end)) {
                    return false;
                }
                start++;
                end--;
            }

            return true;
        }
    }


