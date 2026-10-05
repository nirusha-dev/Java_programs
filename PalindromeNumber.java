public class PalindromeNumber {
    public static void main(String[] args) {

        int x = 121;
        int original = x;
        int reversed = 0;

        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;
        }

        if (original == reversed)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
