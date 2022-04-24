public class Casting {
public static void main(String[] args) {

double myDouble = 1.9;
int downToInt = (int)myDouble;
System.out.printf("ダウンキャスト double -> int%n%s -> %s%n%n", myDouble, downToInt);

float upToFloat = (float)downToInt;
System.out.printf("アップキャスト int -> float%n%s -> %s%n%n", downToInt, upToFloat);

  }
}
