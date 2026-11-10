public class PivotIndex {
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};

        int total = 0;
        int leftSum = 0;

        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            int rightSum = total - leftSum - nums[i];

            if (leftSum == rightSum) {
                System.out.println(i);
                return;
            }

            leftSum += nums[i];
        }

        System.out.println(-1);
    }
} 
    

