import java.util.Scanner;

public class UntilTargetNumberLooper {
  public static void main(String[] args) {
    // 77を定数で定義する
    final int TARGET_NUM = 77;
    // 入力値を取得
    Scanner getInt = new Scanner(System.in);
    int getNum = 0;
    int i = 0;
    String notInt = null;

    System.out.printf("%d が入力されたら終了します。%n%n", TARGET_NUM);


    
    // while文の作成
     while ( getNum != TARGET_NUM) {
      System.out.printf("%d 回目 数字を入力してください: %n", ++i);

       notInt = getInt.nextLine();

      
      try {
        getNum = Integer.parseInt(notInt);
      }catch (NumberFormatException e) {
        System.out.printf("=> 数字以外の値 (%s) が入力されました %n", notInt);
      }

     }

    System.out.printf(" => %d が入力されたので終了しました。 %n", TARGET_NUM);

    getInt.close();
  }
}
