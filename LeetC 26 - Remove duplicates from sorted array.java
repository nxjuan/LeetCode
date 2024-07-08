public class Main {
  public static void main(String[] args) {
    Solution sol = new Solution();
    System.out.println(sol.removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4}));
  }
}

class Solution {
    public int removeDuplicates(int[] nums) {
      int j = 1;
      for(int i = 1; i < nums.length; i++){        
        if (nums[i] > nums[i-1]){
            nums[j] = nums[i];
            j++;
        }        
      }
      return j;
    }
}