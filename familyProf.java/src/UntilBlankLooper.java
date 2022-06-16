import java.util.Scanner;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class UntilBlankLooper {
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    final String BLANK = "";
    String inputtedString;
    int count = 0;
    System.out.println(
        "文字が入力されず Enter キーが押されたら終了します. \n");

    do {
      System.out.printf(
        "%d回目: 文字を入力してください: %n", ++count
      );
    

    inputtedString = stdin.nextLine();

     }  while (!inputtedString.equals(BLANK));
    

  
  System.out.println("\n  => 文字が入力されなかったので終了しました.");

  stdin.close();
  }
}
