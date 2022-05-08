import java.util.ArrayList;
import java.util.List;

public class ListElementPrinter {
  public static void main(String[] args) {
    // ArrayListの要素 = {000, 111, 222}
    // ArrayListの宣言
    ArrayList<String> list = new ArrayList<>();
    list.add("000");
    list.add("111");
    list.add("222");

    for (String element : list) {
      // 実行結果を表示する ここが拡張for文の中に入る
      System.out.printf("%d 番目の要素 => %s %n", list.indexOf(element), element);
    }

  }
}
