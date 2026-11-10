import java.util.*;

public class FindDifference {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int x : nums1) {
            set1.add(x);
        }

        for (int x : nums2) {
            set2.add(x);
        }

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int x : set1) {
            if (!set2.contains(x)) {
                list1.add(x);
            }
        }

        for (int x : set2) {
            if (!set1.contains(x)) {
                list2.add(x);
            }
        }

        System.out.println(Arrays.asList(list1, list2));
    }
}
 