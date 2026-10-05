public class BinaryToInteger {
    public static void main(String[] args) {
        String bits = "101";
        int result = 0;

        for (int i = 0; i < bits.length(); i++) {
            int digit = bits.charAt(i) - '0';
            result = result * 2 + digit;
        }

        System.out.println("Decimal Value: " + result);
    }
}
