package linkedTables;

public class SingleLinkedTable {
     

    public static class Node {
        public int value;
        public Node next;

        public Node(int data) {
            value = data;
        }
    }
        

  public static Node main(Node head){ 
      
    Node pre = null;
    Node next = null;

    while (head != null) {
        next = head.next;
        head.next = pre; 
        pre = head;
        head = next;
     }
    
    return pre;
}





}
