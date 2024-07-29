
public class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.lengthOfLastWord("   fly me   to   the moon  "));
  }
}


class Solution {
    public int lengthOfLastWord(String s) {
      String[] arr = s.split(" ");
      return arr[arr.length - 1].length();
    }
}