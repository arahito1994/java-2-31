import javax.naming.NameAlreadyBoundException;

public class VariousArrays {
  public static void main(String[] args) {
    // 1. 定数宣言:
    // 定数「INDEX_TO_WATCH」を宣言し、「2」を代入する
    final int INDEX_TO_WATCH = 2;
    // 2. int 配列の初期化と表示処理:
    // int 配列「intEmptyArray」を 3 つの要素数で初期化
    int intEmptyArray[] = new int[3];
    // 「intEmptyArray」の「INDEX_TO_WATCH」番目の要素を表示
    System.out.printf("intEmptyArrayの%d番目の要素 = %d%n"
    , INDEX_TO_WATCH, intEmptyArray[INDEX_TO_WATCH]);
    // 3. String 配列の初期化と表示処理:
    // String 配列「strEmptyArray」を 5 つの要素数で初期化
    String strEmptyArray[] = new String[5];
    // 「strEmptyArray」の「INDEX_TO_WATCH」番目の要素を表示
    System.out.printf("strEmptyArrayの%d番目の要素 = %s%n"
    , INDEX_TO_WATCH, strEmptyArray[INDEX_TO_WATCH]);
    // 4. String 配列の初期化と表示処理:
    // int 配列「idArray」を 3 つの要素数で初期化
    int idArray[] = new int[3];
    // 「idArray」の 0 番目に「100」を代入
    idArray[0] = 100;
    // 「idArray」の 1 番目に「101」を代入
    idArray[1] = 101;
    // 「idArray」の 2 番目に「102」を代入
    idArray[2] = 102;
    // 「idArray」の「INDEX_TO_WATCH」番目の要素を表示
    System.out.printf("idArrayの%d番目の要素 = %d%n"
    , INDEX_TO_WATCH, idArray[INDEX_TO_WATCH]);
    // 5. String 配列の初期化と表示処理:
    // String 配列「namesArray」に以下の 5 つの要素を代入して宣言
    // String nameArray[] = new String [5];
    String nameArray[] = { 
      "一堂零", 
      "山本一郎", 
      "すきやばし次郎", 
      "南島三郎", 
      "伊藤四郎" 
    };
    // 一堂零
    // 山本一郎
    // すきやばし次郎
    // 南島三郎
    // 伊藤四郎
    // 「namesArray」の「INDEX_TO_WATCH」番目の要素を表示
    System.out.printf("nameArrayの%d番目の要素 = %s%n"
    , INDEX_TO_WATCH, nameArray[INDEX_TO_WATCH]);

  }
}
