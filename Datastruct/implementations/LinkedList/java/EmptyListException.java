public class EmptyListException extends Exception {
  public EmptyListException() {
    super("The list is empty");
  }
}