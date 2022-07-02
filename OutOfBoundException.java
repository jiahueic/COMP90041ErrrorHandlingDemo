public class OutOfBoundException extends Exception {
  public OutOfBoundException() {
    super("Out of bound exception");
  }

  public OutOfBoundException(String aMessage) {
    super(aMessage);
  }
}
