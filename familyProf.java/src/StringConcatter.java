public class StringConcatter {
  public static void main(String[] args) {
    // 変数「姓」で「山本」を宣言する
    String familyName = "山本";
    // 変数「名」で「一郎」を宣言する
    String firstName = "一郎";
    // 変数「姓」で文字列を結合するメソッドを、変数「名」を引数にして呼び出し、
    // 結合結果を変数「フルネーム」に代入する
    String fullName = familyName.concat(firstName);
    // 変数「フルネーム」を表示する
    System.out.printf("ぼくのフルネームは%sです。%n", fullName);
  }
}