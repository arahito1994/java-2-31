import java.util.Arrays;

public class ArrayUpdater {

  public static void main(String[] args) {
    int[] data = { 1, 2, 3, 4, 5, };

        ArrayUpdater app = new ArrayUpdater();
        app.updateArray(data);

        for (int element : data) {
            System.out.println(element);
        }
    }

    private void updateArray(int[] data) {

        int[] tmp = new int[data.length];

        for (int i = data.length; i > 0; i--) {
            tmp[data.length - i]  = data[i - 1];
        }

        for (int i = 0; i < data.length; i++) {
            data[i] = tmp[i];
        }
  }
}

/**
 * main メソッド
 * main メソッド内でupdateArrayをよびだして
 * main メソッド内で表示する処理がいるsysout
 * 
 * 配列に 1 ～ 5 の整数を詰め込んで、
 * updateArray メソッドで配列内の要素をすべて逆転させ、結果を表示する
 * 
 * updateArray インスタンスメソッド
 * ↑を生成する
 * 渡された配列内の要素を前後逆転させる
 */
