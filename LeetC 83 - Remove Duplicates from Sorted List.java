class ListNode {
  int val;
  ListNode next;
  ListNode(int x) { val = x; }
}

class Solution {
  public ListNode deleteDuplicates(ListNode head) {
      ListNode current = head;

      // Traverse the list
      while (current != null && current.next != null) {
          // If current node's value is equal to the next node's value
          if (current.val == current.next.val) {
              // Skip the next node
              current.next = current.next.next;
          } else {
              // Move to the next node if no duplicate
              current = current.next;
          }
      }

      return head;
  }

  public static void main(String[] args) {
      // Create the linked list: 1 -> 1 -> 2 -> 3 -> 3
      ListNode head = new ListNode(1);
      head.next = new ListNode(1);
      head.next.next = new ListNode(2);
      head.next.next.next = new ListNode(3);
      head.next.next.next.next = new ListNode(3);

      // Print the list before removing duplicates
      System.out.println("List before removing duplicates:");
      printList(head);

      // Remove duplicates
      Solution solution = new Solution();
      head = solution.deleteDuplicates(head);

      // Print the list after removing duplicates
      System.out.println("List after removing duplicates:");
      printList(head);
  }

  // Method to print the linked list
  private static void printList(ListNode head) {
      ListNode current = head;
      while (current != null) {
          System.out.print(current.val + " ");
          current = current.next;
      }
      System.out.println();
  }
}
