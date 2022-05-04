import java.util.ArrayList;
import java.util.List;

public class ArrayListManager {
  public static void main(String[] args) {
    // 1. ArrayList の初期化:
    // List 型の変数「list」を宣言し、ArrayList のインスタンスを代入
    ArrayList<String> list = new ArrayList<>();
    // 2. ArrayList インスタンスが空かどうかの判定結果
    // 変数「isListEmpty」を宣言し、「list」が空かどうかの判定結果を代入
    // 「isListEmpty」の内容を表示
    boolean isListEmpty = list.isEmpty();
    if (isListEmpty) {
      System.out.printf("list の要素が空かどうか => %b %n", isListEmpty);
    }
    // 3. ArrayList インスタンスに要素を追加
    // 「list」に要素「000」を追加
    list.add("000");
    // 「list」に要素「111」を追加
    list.add("111");
    // 「list」に要素「222」を追加
    list.add("222");
    // 4. ArrayList インスタンスの要素数を表示
    // 変数「listSize」を宣言し、「list」の要素数を代入
    int listSize = list.size();
    // 「listSize」の内容を表示
    System.out.printf("list の要素数 => %d %n", listSize);
    // 5. ArrayList インスタンスに対象要素が含まれるかの確認
    // 変数「keyword」を宣言し、「111」を代入
    String keyword = "111";
    // 変数「hasKeyword」を宣言し、「list」の要素に「keyword」が含まれるかどうかの判定結果を代入
    boolean hasKeyword = list.contains(keyword);
    // 「hasKeyword」の内容を表示
    System.out.printf("list の要素に %s があるかどうか => %b %n", keyword, hasKeyword);
    // 6. ArrayList インスタンスの指定インデックスの要素を取得
    // 変数「targetIndex」を宣言し、「2」を代入
    int targetIndex = 2;
    // 変数「target」を宣言し、「list」の targetIndex 番目の要素を代入 -
    String target = list.get(targetIndex);
    System.out.printf("list の%d番目にある要素 => %s %n", targetIndex, target);
    // 7. ArrayList インスタンスのどのインデックスに指定要素があるのかを取得
    // 「target」に「000」を代入
    target = "000";
    // 「targetIndex」に、list のどのインデックスに target にあるのかを代入
    targetIndex = list.indexOf(target);
    // 「targetIndex」の内容を表示
    System.out.printf("list の要素 「%s」 があるのは => %d 番目 %n%n", target, targetIndex);
    // 8. ArrayList インスタンスの要素の更新と削除
    // list のインデックス 2 の要素を「UPDATE」に上書き
    list.set(2, "UPDATE");
    // list のインデックス 0 の要素を削除
    list.remove(0);
    // 9. ArrayList インスタンスのすべての要素を表示
    // list のすべての要素を表示
    for (int i = 0; i < list.size(); i++) {
      System.out.printf("list の %d 番目の要素 => %s %n", i, list.get(i));
    }
  }
}
