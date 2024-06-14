
public class Main {
  public static void main(String[] args) {
    int val = 1001;
    Solution s = new Solution();
    System.out.println(s.isPalindrome(val));
  }
}

class Solution {
    public boolean isPalindrome(int x) {
      if(x < 0){
        return false;
      }
      String text = x + "";
      String[] array = text.split("");
      for(int i = 0; i < array.length / 2; i++){
        if(!array[i].equals(array[array.length - i - 1])){
          return false;
        }
      }       
      return true;
    }
}