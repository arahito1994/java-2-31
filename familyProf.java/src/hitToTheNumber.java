import java.util.Random;
import java.util.Scanner;

public class hitToTheNumber {
  public static void main(String[] args) {
    final int MAX_NUM = 5;
    final int RANDOM_NUM = 100;

    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    
    System.out.printf("数字を当ててみてね。 %n%n 答えられるのは %d 回までだよ。 %n%n", MAX_NUM);
    int correctNum = rand.nextInt(RANDOM_NUM);

    // ユーザーの入力値と正解が一致したらコメント吐き出す、挑戦回数を表示する
    for(int tryNum = 0;tryNum < MAX_NUM;tryNum++){
      System.out.printf("%d 回目: ", tryNum + 1);
      int userInputNum = scan.nextInt();
        if (userInputNum == correctNum) {
          System.out.printf("すごい!! %d 回で当てられちゃった! %n", tryNum + 1);
        return;
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
        
      //     if (userInputNum != correctNum) {
      //         if (userInputNum < correctNum) {
      //           System.out.println("もっと大きい数字だよ");
      //           System.out.println();
      //         }else{
      //           System.out.println("もっと小さい数字だよ");
      //           System.out.println();
      //         }
      //     }else{
      //        System.out.printf("すごい!! %d 回で当てられちゃった! %n", tryNum + 1);
      //        return;
      //     }
      // }
      // System.out.printf("残念!! 正解は %d でした! %n", correctNum);
      // scan.close();
  }
}


