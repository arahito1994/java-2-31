import java.text.DecimalFormat;

public class PercentFormatter {
  public static void main(String[] args) {
    double AnnualRate = 123456.78935465;

    DecimalFormat precentFormat = new DecimalFormat("0,000.##%");
    System.out.println(precentFormat.format(AnnualRate));
  }
}
