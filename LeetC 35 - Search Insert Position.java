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
    int mid = (l + r) / 2;
    do{
      if(nums[mid] == target){
        return mid;
      }
      else if(target > nums[mid]){
        r = mid;
        mid = (l + r) / 2;
      }
      else{
        l = mid + 1;
        mid = (l + r) / 2;
      }
    }while(l != r);
    if(mid == 0){
      return (r > target) ? r : ++r;
    }
    else if (mid == nums.length){
      return (r > target) ? r : ++r;
    }
    return r;
  }
}