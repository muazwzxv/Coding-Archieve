
public class BinaryTree {
  Node root;

  BinaryTree() {
    this.root = null;
  }

  public void add(int val) {
    root = addRecursive(root, val);
  }
  private Node addRecursive(Node current, int val) {
    if (current == null)
      return new Node(val);

    if (val < current.val)
      current.left = addRecursive(current.left, val);
    else if (val > current.val)
      current.right = addRecursive(current.right, val);
    else
      return current;

    return current;
  }

  public boolean contains(int val) {
    return isContains(root, val);
  }
  private boolean isContains(Node current, int val) {
    if (current == null)
      return false;

    if (val == current.val)
      return true;

    return val < current.val ? isContains(current.left, val) : isContains(current.right, val);
  }


  public void delete(int val) {
    root = deleteRecursive(this.root, val);
  }
  // I dont really understand this one YET
  private Node deleteRecursive(Node current, int val) {
    if (current == null)
      return null;
    
    // To delete found, proceed to delete the element
    if (val == current.val) {
      // case 1: No children
      if (current.left == null && current.right == null)
        return null;

      // case 2: only 1 child
      if (current.right == null)
        return current.left;
      if (current.left == null)
        return current.right;

      // case 3: 2 children
      int min = findSmallestNode(current.right);
      current.val = min;
      current.right = deleteRecursive(current.right, val);
      return current;
    }
  
    // If not found :- traverse the rest of the nodes
    if (val < current.val) {
      current.left = deleteRecursive(current.left, val);
      return current;
    }
    current.right = deleteRecursive(current.right, val);
    return current;
  }
  // Helper methods for delete
  private int findSmallestNode(Node root) {
    return root.left == null ? root.val : findSmallestNode(root.left);
  }
}
