public class Main {
  public static void main (String[] args) {
    new PrintThread("One").start();
    new PrintThread("Two").start();
  }
}
