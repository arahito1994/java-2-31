import java.util.Scanner;

public class StringInputReciever {
  public static void main(String[] args) {

    Scanner scanString = new Scanner(System.in);
    System.out.println("文字を入力してください: ");

    String getString = scanString.next();
    System.out.printf("入力された名前は%sです。%n", getString);

    scanString.close();
  }
}
