import java.util.Scanner;

public class NumberInputReciever {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.print("数字を入力してください: ");

    int num = scan.nextInt();
    System.out.printf("入力された数字は%dです。%n", num);
    scan.close();
  }
}
