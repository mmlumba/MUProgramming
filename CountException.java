public class CountException extends Exception {
  public CountException() {
    super("Error: More than 5 pizzas ordered!!!");
  }
  public CountException(String message) {
    super(message);
  }
}