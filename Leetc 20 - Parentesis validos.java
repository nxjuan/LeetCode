import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.isValid("}"));
  }
}


class Solution {
    public boolean isValid(String s) {
      Stack<Character> stack = new Stack<>();
      for (char c : s.toCharArray()){
        
        if(c == '(' || c == '{' || c == '['){
          stack.push(c);
        }
        else if(!stack.isEmpty()){
          if(c == ')' && stack.peek() == '('){
            stack.pop();
          }
          else if(c == '}' && stack.peek() == '{'){
            stack.pop();
          }
          else if(c == ']' && stack.peek() == '['){
            stack.pop();
          }
          else{
            return false;
          }
        }else{
          return false;
        }
      }
      if(stack.isEmpty()){
        return true;
      }
      return false;
    }
}