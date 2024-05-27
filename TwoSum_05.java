public class Main {
  public static void main(String[] args) {
    Solution solution = new Solution();
    solution.twoSum(new int[] {3,2,4}, 6);
  }
}

// Solução abaixo
class Solution {
  public int[] twoSum(int[] nums, int target) {
    for(int i = 0; i < nums.length; i++){
      for(int j = i + 1; j < nums.length; j++){
        if(nums[i] + nums[j] == target){
          //System.out.println("[" + i + ", " + j + "]");
          return new int[] {i, j};
        }
      }
    }
    return null;
  }
}