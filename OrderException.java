public class OrderException extends Exception {
  public OrderException() {
    super("Can't order! Limit is 5 orders!!!");
  }
  public OrderException(String message) {
    super(message);
  }
}