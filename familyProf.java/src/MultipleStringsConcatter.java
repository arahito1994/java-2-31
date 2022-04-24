public class MultipleStringsConcatter {
  public static void main(String[] args) {
    // 1. 定数宣言
    // 定数「半角スペース」で「 」を宣言する
    final String HALF_WIDTH_SPACE = " ";
    // 2. 変数宣言
    // StringBuilder クラスのインスタンスを生成して、StringBuilder 型の変数「文字列組立」に代入する
    StringBuilder build = new StringBuilder();
    // 変数「姓」で「山本」を宣言する
    String familyName = "山本";
    // 変数「名」で「一郎」を宣言する
    String firstName = "一郎";
    // 3. 文字列結合
    // 変数「文字列組立」で文字列追加メソッドを、変数「姓」を引数にして呼び出す
    build.append(familyName);
    // 変数「文字列組立」で文字列追加メソッドを、定数「半角スペース」を引数にして呼び出す
    build.append(HALF_WIDTH_SPACE);
    // 変数「文字列組立」で文字列追加メソッドを、変数「名」を引数にして呼び出す
    build.append(firstName);
    // 4. 表示処理
    // 変数「文字列組立」の内容を表示する
    System.out.println(build);
  }
}
