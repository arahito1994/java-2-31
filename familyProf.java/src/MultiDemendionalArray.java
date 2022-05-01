public class MultiDemendionalArray {
  public static void main(String[] args) {
// 1. 定数宣言:
// 定数「HORIZONTAL_INDEX」（水平方向のインデックス）を宣言し、「2」を代入する
final int HORIZONTAL_INDEX = 2;
// 定数「VERTICAL_INDEX」（垂直方向のインデックス）を宣言し、「1」を代入する
final int VERTICAL_INDEX = 1;
// 2. int 配列の初期化と表示処理:
// int 配列「dimArray」に以下の表の内容になるように要素を代入して宣言
int dimArray[][] = new int[3][];
dimArray[0] = new int[4];
dimArray[1] = new int[4];
dimArray[2] = new int[4];

dimArray[0][0] = 1;
dimArray[0][1] = 2;
dimArray[0][2] = 3;
dimArray[0][3] = 4;

dimArray[1][0] = 5;
dimArray[1][1] = 6;
dimArray[1][2] = 7;
dimArray[1][3] = 8;

dimArray[2][0] = 9;
dimArray[2][1] = 10;
dimArray[2][2] = 11;
dimArray[2][3] = 12;

// 3. 多次元配列の指定要素の表示処理:
// 「dimArray」の横に「HORIZONTAL_INDEX」番目、縦に「VERTICAL_INDEX」番目の要素を表示
System.out.printf("水平方向(X)に%d, 垂直方向(Y)に%dのインデックスにある値 => %d%n"
, HORIZONTAL_INDEX, VERTICAL_INDEX, dimArray[VERTICAL_INDEX][HORIZONTAL_INDEX]);
  }
}
