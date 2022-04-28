

public class ArithmeticOperator {

  public static void main(String[] args) {

    // 1. 変数宣言、変数への代入処理:
    // 変数「a」に 「12」を代入する
    int a = 12;
    // 変数「b」に 「5」を代入する
    int b = 5;
    // 2. 変数に代入した数値の表示処理:
    // 変数 a と b の内容を表示する
    System.out.printf("a = %d, b = %d%n", a, b);
    System.out.println();
    // 3. 加算処理:
    // 変数 a に b を足した結果を表示する
    System.out.printf("a + b = %d%n", a + b);
    // 4. 減算処理:
    // 変数 a から b を引いた結果を表示する
    System.out.printf("a - b = %d%n", a - b);
    // 5. 乗算演算子:
    // 変数 a を b 掛けた結果を表示する
    System.out.printf("a * b = %d%n", a * b);
    // 6. 商算演算子:
    // 変数 a を b で割った結果を表示する
    System.out.printf("a / b = %d%n", a / b);
    // 7. 余算演算子:
    // 変数 a を b で割った余りを表示する
    System.out.printf("a %% b = %d%n", a % b);
    // 8. 文字列結合:
    // 変数 a と b を算術演算子で結合して表示する
    System.out.printf("a + b =" + "%d" + "%d%n", a, b);

  }
}
