import java.util.Arrays;

public class plusOne {
    public static void main(String[] args) {
        int[] digits = {1, 2, 3};

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                break;
            }
            digits[i] = 0;
        }

        if (digits[0] == 0) {
            int[] ans = new int[digits.length + 1];
            ans[0] = 1;
            digits = ans;
        }

        System.out.println(Arrays.toString(digits));
    }
}