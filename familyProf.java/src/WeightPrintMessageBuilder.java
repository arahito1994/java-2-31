public class WeightPrintMessageBuilder {
  public static void main(String[] args) {
    int weight = 7777;
    String kg = "キロ";
    String message = String.format("ぼくの体重は%d%sです。", weight, kg);

    System.out.println(message);
  }
}
