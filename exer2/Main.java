
public class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; this.next = null; }

     public static ListNode deserialize(String data) {
        if (data == null || data.equals("[]")) return null;
        
         String[] values = data.substring(1, data.length() - 1).split(",");
        ListNode head = new ListNode(Integer.parseInt(values[0]));
        ListNode current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(Integer.parseInt(values[i]));
            current = current.next;
        }
        return head;
    }
}

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
         if (head == null) return null;
        
        ListNode current = head;
        while (current !=null && current.next != null){
            if (current.val == current.next.val) {
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
        return head;
    }
}
