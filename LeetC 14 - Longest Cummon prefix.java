public class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println("\"" +
      s.longestCommonPrefix(new String[] {"dog","racecar","car"}) + "\""
    );
  }
}


class Solution {
    public String longestCommonPrefix(String[] strs) {
      String prfx = strs[0];

      for (int i = 1; i <= strs.length - 1; i++){
        String p = "";
        for (int j = 0;  j < strs[i].length() && j < prfx.length(); j++){
          if(strs[i].charAt(j) == prfx.charAt(j)){
            p += strs[i].charAt(j);
          }
          else{
            break;
          }
        }
        prfx = p;        
      }      
      return prfx;
    }
}