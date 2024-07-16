import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.searchInsert(new int[] {1,3,5,6}, 0));
  }
}

class Solution {
  public int searchInsert(int[] nums, int target) {
    int l = 0;
    int r = nums.length - 1;
    while(l <= r){        
      int mid = l + (r - l) / 2;

      if(nums[mid] == target){
        return mid;
      }
      else if(target < nums[mid]){
        r = mid - 1;
      }
      else{
        l = mid + 1;
      }
    }
    return l;       
  }
}