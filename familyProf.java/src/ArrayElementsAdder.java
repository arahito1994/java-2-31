public class ArrayElementsAdder {
  public static void main(String[] args) {
    // 配列numbersを宣言 要素[3, 4, 5, -5, 0, 12]

    int numbers[] = { 3, 4, 5, -5, 0, 12 };

    int sum = 0;

    for (int number: numbers) {
      sum += number;
    }

    // 実行結果を表示する
    System.out.printf("配列 numbers の %d 個の要素の合計 => %d %n", numbers.length, sum);
  }
}
