import java.util.HashSet;
import java.util.Set;

public class java_arrays {

    // function to check if an array has a duplicate
    public boolean hasDuplicate(int[] nums) {
        // make a set to store unique values found in the nums array
        Set<Integer> vals = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            // check if the value in nums exists in the set, if not then add the value to
            // the set and continue checking
            if (vals.contains(nums[i])) {
                return true;
            }
            vals.add(nums[i]);
        }
        return false;
    }// end has duplicate method

    public static void main(String[] args) {
        java_arrays prob1 = new java_arrays();
        int[] no_dupe = { 1, 2, 3, 4, 5 };
        int[] dupe = { 1, 2, 3, 4, 4, 5 };
        System.out.println(prob1.hasDuplicate(no_dupe));
        System.out.println(prob1.hasDuplicate(dupe));

    }// end main
}// end java_arrays class