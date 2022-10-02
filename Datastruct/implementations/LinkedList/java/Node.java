

public class Node {

  Object data;
  Node next;

  public Node(Object data) {
    this(data, null);
  }

  public Node(Object data, Node next) {
    this.data = data;
    this.next = next;
  }

  public Object getData() {
      return this.data;
  }

  public Object getNext() {
      return this.next;
  }
}

