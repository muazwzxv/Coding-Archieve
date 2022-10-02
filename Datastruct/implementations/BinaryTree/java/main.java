
public class main {
  public static void main(String [] args) {
    BinaryTree tree = new BinaryTree();

    tree.add(6);
    tree.add(4);
    tree.add(8);
    tree.add(3);
    tree.add(5);
    tree.add(7);
    tree.add(9);

    System.out.println("InOrder Traversal: ");
    tree.printInOrder();

    System.out.println("PreOrder Traversal: ");
    tree.printPreOrder();

    System.out.println("PostOrder Traversal: ");
    tree.printPostOrder();
  }
}
