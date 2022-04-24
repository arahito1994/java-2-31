public class StringSplitter {
  public static void main(String[] args) {
    // 変数「フルネーム」で「山本 一郎」を宣言する
    String fullName = "山本 一郎";
    // 変数「フルネーム」で 文字列を分割するメソッドを、半角スペースを引数にして呼び出し、分割結果を変数「名前配列」に代入する

    String[] name = fullName.split(" ", 2);

    // 変数「名前配列」を使って、姓と名を表示する
    System.out.printf("性: %S, 名: %S %n", name[0], name[1]);

  }

}
