public class Printer implements Runnable {
  private String message;
  public Printer (String msg) {
    this.message = msg;
  }
  public void run () {
    for (int i = 0; i < 10000; ++i) {
      System.out.print(message);
    }
  }
}
