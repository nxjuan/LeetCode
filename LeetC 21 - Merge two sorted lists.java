 public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
      ListNode l1 = new ListNode();
      ListNode real = l1;
      while(list1 != null && list2 != null){
        if(list1.val > list2.val){
            real.next = list2;
            list2 = list2.next;
        }else{
            real.next = list1;
            list1 = list1.next;
        }
        real = real.next;
      }
      real.next = (list1 != null) ? list1 : list2;
      return l1.next;
    }
}
