public class PrintThread extends Thread {
  private String message;
  public PrintThread(String msg) {
    this.message = msg;
  }

  public void run () {
    for (int i = 0; i < 10000; ++i) {
      System.out.print(message);
    }
  }
}
