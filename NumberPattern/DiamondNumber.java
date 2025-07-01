//      1
//     222
//    33333
//   4444444
//  555555555
//   6666666
//    77777
//     888
//      9


package NumberPattern;

public class DiamondNumber {
    public static void main(String[] args) {
        for (int i = 1 ; i <= 5 ; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print(i);
            }
            for (int j = 2; j <= i ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        for (int i = 2; i <= 5 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(" ");
            }

            for (int j = i; j < 5 ; j++) {
                System.out.print(i + 4);
            }

            for (int j = i; j <= 5 ; j++) {
                System.out.print(i + 4);

            }





            System.out.println();
        }


        
    }
}
