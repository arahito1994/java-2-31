public class StringCutOut {
  public static void main(String[] args) {
    // 1. 定数宣言
    // 定数「始点」として「2」を宣言する
    final int START_POINT = 2;
    // 定数「終点」として「6」を宣言する
    final int END_POINT = 6;
    // 2. 変数宣言
    // 変数「対象文字列」で「investment」を宣言する
    String subjectString = "investment";
    // 3. 文字列の切り出し
    // 変数「対象文字列」で文字列の切り出しメソッドを、定数「始点」と定数「終点」を引数にして呼び出し、切り出した結果を変数「結果文字列」に代入する
    String resultString = subjectString.substring(START_POINT, END_POINT);
    // 4. 表示処理
    // 変数「結果文字列」の内容を表示する
    System.out.println(resultString);
  }
}
