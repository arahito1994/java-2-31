import java.util.Random;

public class SurvivorChecker {
// main メソッドに以下の 3 つの処理を記述して、プログラム実行結果が以下に示した結果になるように SurvivorChecker クラスを作成しなさい
public static void main(String[] args) {
  
// Random クラスのインスタンスを作成
Random rand = new Random();
// 変数「ぼくの名前」に「山本一郎」を代入
String myName = "山本一郎";
// 「生きているかどうか」をあらわす変数に Random インスタンスからランダムに生成した true もしくは false を代入
boolean isLive = rand.nextBoolean();
// 生きていれば「〇〇 は生きてるよ.」を表示
if (isLive) {
    System.out.printf("%Sは生きてるよ.%n", myName);
// 生きていなければ「〇〇 は死んでるよ.」を表示
}else{
     System.out.printf("%Sは死んでるよ.%n", myName);
    }
  }
}
