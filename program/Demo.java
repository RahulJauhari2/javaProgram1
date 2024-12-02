class Node {
  int data;
  Node next;

  Node(int data) {
      this.data = data;
      this.next = null;
  }
}
class LinkedList {
  Node head;

  // Method to insert a new node at the end of the list
  public void insert(int data) {
      Node newNode = new Node(data);
      if (head == null) {
          head = newNode;
      } else {
          Node current = head;
          while (current.next != null) {
              current = current.next;
              System.out.println("current.next "+current.next);
          }
          current.next = newNode;
      }
  }

  // Method to display the linked list
  public void display() {
      Node current = head;
      while (current != null) {
          System.out.print(current.data + " -> ");
          current = current.next;
      }
      System.out.println("null");
  }

  // Method to delete a node with a specific value
  public void delete(int data) {
      if (head == null) {
          return;
      }
      if (head.data == data) {
          head = head.next;
          return;
      }
      Node current = head;
      while (current.next != null && current.next.data != data) {
          current = current.next;
      }
      if (current.next != null) {
          current.next = current.next.next;
      }
  }
}
public class Demo {
  public static void main(String[] args) {
      LinkedList list = new LinkedList();

      // Insert nodes
      list.insert(10);
      list.insert(20);
      list.insert(30);

      // Display the list
      list.display(); // Output: 10 -> 20 -> 30 -> null

      // Delete a node
     // list.delete(20);

      // Display the list after deletion
      list.display(); // Output: 10 -> 30 -> null
  }
}
