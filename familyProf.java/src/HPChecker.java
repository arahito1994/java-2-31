// import java.util.Random;


// public class HPChecker {
//   static final Random RANDOM = new Random();
//   static final int HIT_POINT = 10;
//   public static void main(String[] args) {

//     while (HIT_POINT != 0) {
//       int hitPoint = RANDOM.nextInt(HIT_POINT);
//       if (hitPoint == 0) {
//         System.out.printf("HP => %d: 死んでます。 %n", hitPoint);
//         return;
//       }else{
//         System.out.printf("HP => %d: 生きてます。 %n", hitPoint);
//       }
//     }
//   }
// }

import java.util.Random;

public class HpChecker {
    public static void main(String[] args) {

        Random rand = new Random();
        
        int hp = 0;
        boolean isDead = false;

        while (!isDead) {
            hp = rand.nextInt(10);

            isDead = isDead(hp);
            if (!isDead) {
                System.out.printf("HP => %d: 生きてます. %n", hp);
            }
        }
        System.out.printf("HP => %d: 死んでます. %n", hp);
    }

    public static boolean isDead(int hp) {
        return hp == 0;
    }
}