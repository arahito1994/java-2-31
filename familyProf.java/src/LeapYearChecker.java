public class LeapYearChecker {
  public static void main(String[] args) {
// 判定したい年
// 紀元前 45 年
// 西暦 356  年
// 西暦 1700 年
// 西暦 2300 年
// 西暦 2596 年

// 判定したい年を変数leapYearを配列で宣言
int leapYear[] = {-45, 356, 1700, 2300, 2596};
// 閏年は西暦が4で割り切れる年、ただし100で割り切れるものは平年となる
// → leapYear %% 100 != 0 && leapYear %% 4 == 0 
// 配列で宣言してるから順番にいれて
for (int i = 0;  i <= leapYear.length; i++) {
  if (leapYear[i] % 4 == 0 && leapYear[i] % 100 != 0){
  System.out.printf("西暦 %d 年は、うるう年です。 %n", leapYear[i]);
  }else{
  System.out.printf("西暦 %d 年は、うるう年ではありません。 %n", leapYear[i]);
  }
}




  }
}
