

public class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.mySqrt(8));
  }
}


class Solution {
    public int mySqrt(int x) {
        int n = (int) Math.sqrt(x);
        return n;
    }
}