import java.util.Scanner;
public class ReverseEachword {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter a sentence: ");
        String str = sc.nextLine();
       String[] words = str.split(" ");
        for (String word : words) {
            String rev = "";
      for (int i = word.length() - 1; i >= 0; i--) {
                rev = rev + word.charAt(i);
            }
       System.out.print(rev + " ");
        }

        sc.close();
    }
}
