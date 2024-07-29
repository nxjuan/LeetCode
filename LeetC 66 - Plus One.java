import java.util.Arrays;
public class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    
    System.out.println(Arrays.toString(s.plusOne(new int[] {9})));
  }
}

class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        while(true){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }else{
                digits[i] = 0;
                --i;
            }
            if(i < 0){
                digits = new int[digits.length + 1];
                digits[0] = 1;
                return digits;
            }
        }
    }
}