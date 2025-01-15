import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int bigger = 1;
        int counter = 1;

        if (nums.length == 0) {
            return 0;
        }

        if (nums.length > 1) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == nums[i - 1] + 1) {
                    counter++;
                } else if (nums[i] != nums[i - 1]) {
                    counter = 1;
                }

                if (counter > bigger) {
                    bigger = counter;
                }

            }
        }

        return bigger;
    }
}