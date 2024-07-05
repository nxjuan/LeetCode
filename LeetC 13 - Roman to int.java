import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.romanToInt("MCMXCIV"));
  }
}

class Solution {
    public int romanToInt(String s) {
      int result = 0;
      char[] lst = s.toCharArray();

      Map<Character, Integer> map = new LinkedHashMap<>();

      map.put('I', 1);
      map.put('V', 5);
      map.put('X', 10);
      map.put('L', 50);
      map.put('C', 100);
      map.put('D', 500);
      map.put('M', 1000);
      
      for (int i = 0; i < lst.length; i++){
        result += map.get(lst[i]);
        
        if (i > 0) {
          if(map.get(lst[i-1]) < map.get(lst[i])){
            result -= map.get(lst[i-1]) * 2;
          }
        }
          
      }
      return result;
    }
}