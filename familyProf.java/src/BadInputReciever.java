import java.util.InputMismatchException;
import java.util.Scanner;

public class BadInputReciever {
  public static void main(String[] args) {
    Scanner scanInt = new Scanner(System.in);

    System.out.print("数字を入力してください:");

    try {
      int number = scanInt.nextInt();
      System.out.printf("入力された数字は %d です.", number);

    } catch (InputMismatchException e) {
      System.out.println("数字以外の文字が入力されました。");
    }

    scanInt.close();
  }
}

