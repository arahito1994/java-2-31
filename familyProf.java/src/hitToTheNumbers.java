import java.util.Random;
import java.util.Scanner;

public class hitToTheNumbers {
  public static void main(String[] args) {
    final int MAX_NUM = 5;
    final int RANDOM_NUM = 100;

    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    System.out.printf("数字を当ててみてね。 %n%n 答えられるのは %d 回までだよ。 %n%n", MAX_NUM);
    int correctNum = rand.nextInt(RANDOM_NUM);
    int userInputNum = 0;
    String strInput  = "";

    for(int tryNum = 0;tryNum < MAX_NUM;tryNum++){

      // 数字以外が入力された時エラー文を表示して処理を終了する
      System.out.printf("%d 回目: ", tryNum + 1);
        strInput = scan.nextLine();
        try {
          userInputNum = Integer.parseInt(strInput);
        } catch (Exception e) {
          System.out.println("数字以外が入力されました。");
          System.out.println();
          break;
        }

        
        // 入力された数字を判定する
        if (userInputNum == correctNum) {
          System.out.printf("すごい!! %d 回で当てられちゃった! %n", tryNum + 1);
          // return;
        }
        else if (userInputNum < correctNum) {
          System.out.println("もっと大きい数字だよ");
          System.out.println();
        }else{
          System.out.println("もっと小さい数字だよ");
          System.out.println();
        }
    }
    System.out.printf("残念!! 正解は %d でした! %n", correctNum);
    scan.close();
  }
}
