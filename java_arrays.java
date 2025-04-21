import java.util.HashMap;
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

    public boolean isAnagram(String s, String t) {
        //check if the strings are the same length
        if(s.length() != t.length()){
            return false;
        }
        
        //create two hash maps to count the letters for instance "a": 7
        HashMap<Character, Integer> letter_count_s = new HashMap<>();
        HashMap<Character, Integer> letter_count_t = new HashMap<>();


        for(int i = 0 ; i < s.length(); i++){
            //check if the current letter is in the map, if yes then increase the count, if not then add it to the map 
            letter_count_s.put(s.charAt(i), letter_count_s.getOrDefault(s.charAt(i),0)+1);
            letter_count_t.put(t.charAt(i), letter_count_t.getOrDefault(t.charAt(i),0)+1) ;

        }
        
        //compare both maps such as having same values and counts
        return letter_count_s.equals(letter_count_t);

    }

    public static void main(String[] args) {
        java_arrays prob1 = new java_arrays();
        int[] no_dupe = { 1, 2, 3, 4, 5 };
        int[] dupe = { 1, 2, 3, 4, 4, 5 };
        System.out.println(prob1.hasDuplicate(no_dupe));
        System.out.println(prob1.hasDuplicate(dupe));

    }// end main
}// end java_arrays class