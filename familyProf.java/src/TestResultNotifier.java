import java.util.Scanner;

public class TestResultNotifier {
  public static void main(String[] args) {

    final int PASS_SCORE_MIN = 70;
    System.out.println("100点満点中、何点だったか回答してください。");
    // 数学の得点は？を表示
    System.out.print("数学の得点は？: ");

    Scanner score = new Scanner(System.in);

    int mathScore = score.nextInt();
    System.out.println(mathScore);

    // 三項演算子を使用して、70点以上なら合格、69点以下なら不合格を判定する
    String result = (mathScore >= PASS_SCORE_MIN) ? "合格" : "不合格";

    System.out.printf("数学のテストは %s です。 %n", result);
    score.close();

  }
}
