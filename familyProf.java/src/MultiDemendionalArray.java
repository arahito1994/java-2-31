public class MultiDemendionalArray {
  public static void main(String[] args) {
// 1. 定数宣言:
// 定数「HORIZONTAL_INDEX」（水平方向のインデックス）を宣言し、「2」を代入する
final int HORIZONTAL_INDEX = 2;
// 定数「VERTICAL_INDEX」（垂直方向のインデックス）を宣言し、「1」を代入する
final int VERTICAL_INDEX = 1;
// 2. int 配列の初期化と表示処理:
// int 配列「dimArray」に以下の表の内容になるように要素を代入して宣言

int[][] dimArray = {
  { 1, 2, 3, 4, },
  { 5, 6, 7, 8, },
  { 9, 10, 11, 12, },
};


// 3. 多次元配列の指定要素の表示処理:
// 「dimArray」の横に「HORIZONTAL_INDEX」番目、縦に「VERTICAL_INDEX」番目の要素を表示
System.out.printf("水平方向(X)に%d, 垂直方向(Y)に%dのインデックスにある値 => %d%n"
, HORIZONTAL_INDEX, VERTICAL_INDEX, dimArray[VERTICAL_INDEX][HORIZONTAL_INDEX]);
  }
}
