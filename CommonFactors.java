public class CommonFactors {
    public static void main(String[] args) {
        int a = 12;
        int b = 6;
        int count = 0;

        int limit = Math.min(a, b);

        for (int i = 1; i <= limit; i++) {
            if (a % i == 0 && b % i == 0) {
                count++;
            }
        }

        System.out.println("Number of common factors: " + count);
    }
}