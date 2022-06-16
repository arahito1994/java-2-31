public class BreakNest {
  public static void main(String[] args) {
  /*九九を表示させる
  条件分岐で<=20を表示する

  */

  final int LIMIT = 20;

  for (int i = 1; i < 10; i++){
    for (int j = 1; j < 10; j++){
      int score = i * j;
      if (score > LIMIT) break;
        System.out.printf("%2dX%2d=%2d", i, j, score);
      }
      System.out.println();
    }
  }
  }

