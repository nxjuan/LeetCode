
public class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.strStr("sadbutsad", "sad"));
  }
}

class Solution {
    public int strStr(String haystack, String needle) {
        for(int i = 0; i <= haystack.length() - needle.length(); i++){
            String str = haystack.substring(i, i + needle.length());
            if(str.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}