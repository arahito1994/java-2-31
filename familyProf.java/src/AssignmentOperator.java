
public class AssignmentOperator {
  public static void main(String[] args) {
    // 1. 変数宣言、変数への代入処理:
    // 変数「a」に 「4」を代入する
    int a = 4;
    // 変数「target」を宣言する
    int target;
    // 2. 値の代入に「=」を使う:
    // 変数「target」への変数「a」の代入に「=」を使う
    target = a;
    // 変数「target」を表示する
    System.out.printf("target = a: %d%n", target);
    // 3. 値の代入に「+=」を使う:
    // 変数「target」への変数「a」の代入に「+=」を使う
    target += a;
    // 変数「target」を表示する
    System.out.printf("target += a: %d%n", target);
    // 4. 値の代入に「*=」を使う:
    // 変数「target」への変数「a」の代入に「*=」を使う
    target *= a;
    // 変数「target」を表示する
    System.out.printf("target *= a: %d%n", target);

  }
}
