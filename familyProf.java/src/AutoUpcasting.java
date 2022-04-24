public class AutoUpcasting {
  public static void main(String[] args) {
//     1. 変数宣言、変数への代入処理:
// char 型の変数「myChar」に a を代入
char myChar = 'a';
// 2. 自動キャスト処理:
// int 型の変数「ascii」に myChar を代入
int ascii = (int)myChar;
// 3. 表示処理:
// 変数 myChar と ascii の内容を表示
System.out.println("char -> int への自動キャスト");
System.out.printf("%s ->%s%n%n", myChar, ascii);
// 4. アップキャスト処理:
// 変数 myChar を int 型の castAscii にキャスト
int castAscii = (int)myChar;
// 5. 表示処理:
// 変数 myChar と castAscii の内容を表示
System.out.println("char -> int へのアップキャスト");
System.out.printf("%s ->%s%n%n", myChar, castAscii);

  }
}
