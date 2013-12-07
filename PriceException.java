public class PriceException extends Exception {
  public PriceException() {                                        
    super("Error: Price is $0.000");
  }
  public PriceException(String message) {
    super(message);
  }
}