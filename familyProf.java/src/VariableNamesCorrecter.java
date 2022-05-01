public class VariableNamesCorrecter {
  public static void main(String[] args) {
    // ボールペンのコード番号
    String ballpenCode = "BPBK-007";
    // ボールペンの値段
    int ballpenPrice = 110;
    // ボールペンの本数
    int ballpenQuantity = 1;
    // ボールペンの合計金額
    int ballpenAmount = 0;
    // ノートのコード番号
    String notebookCode = "NTBK-102 20P";
    // ノートの値段
    int notebookPrice = 80;
    // ノートの本数
    int notebookQuantity = 5;
    // ノートの合計金額
    int notebookAmount = 0;
    // 消費税率 10%
    final double TAX_RATE = 1.10;
    // 文房具の合計金額
    int totalAmount = 0;
    ballpenAmount = (int) Math.round((ballpenPrice * ballpenQuantity) * TAX_RATE);
    notebookAmount = (int) Math.round((notebookPrice * notebookQuantity) * TAX_RATE);
    totalAmount = ballpenAmount + notebookAmount;
    System.out.printf("%12s: 1 個 %3d 円 × %1d 個 = %3d 円（税込）%n"
        , ballpenCode, ballpenPrice, ballpenQuantity, ballpenAmount);
    System.out.printf("%12s: 1 個 %3d 円 × %1d 個 = %3d 円（税込）%n"
        , notebookCode, notebookPrice, notebookQuantity, notebookAmount);
    System.out.printf("すべての文房具の合計金額 = %d 円（税込）%n"
        , totalAmount);
}
}
