import java.util.Random;
import java.util.Scanner;

public class hitToTheNum {
    public static void main(String[] args) {
      final int MAX_NUM = 5;
      final int RANDOM_NUM = 100;
      Scanner scan = new Scanner(System.in);
      Random rand = new Random();
      int correctNum = rand.nextInt(RANDOM_NUM);
      

      System.out.printf("数字を当ててみてね。 %n%n 答えられるのは %d 回までだよ。 %n%n", MAX_NUM);
          for(int tryNum = 0;tryNum < MAX_NUM;tryNum++){
            System.out.printf("%d 回目: ", tryNum + 1);
            int userInputNum = scan.nextInt();
            if (userInputNum == correctNum) {
              System.out.printf("すごい!! %d 回で当てられちゃった! %n", tryNum + 1);
              return;
            }
            checkNum(rand, userInputNum, correctNum, RANDOM_NUM, tryNum);
          }
          System.out.printf("残念!! 正解は %d でした! %n", correctNum);
          scan.close();
        }
        

    private static void checkNum(Random rand, int userInputNum, int correctNum, int RANDOM_NUM, int tryNum) {
      if (userInputNum < correctNum) {
        System.out.println("もっと大きい数字だよ");
        System.out.println();
      }else{
        System.out.println("もっと小さい数字だよ");
        System.out.println();
      }
  }
}
