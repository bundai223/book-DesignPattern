public class Main {
  public static void main (String[] args) {
    new Thread(new Printer("hoge")).start();
    new Thread(new Printer("fuga")).start();
  }
}
