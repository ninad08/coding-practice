//         1
//        121
//       12321
//      1234321
//     123454321


package NumberPattern;

public class HillWithDiffNum {
    public static void main(String[] args) {
        for (int i = 1; i <= 5 ; i++) {
            for (int j = i; j <= 5 ; j++) {
                System.out.print(" ");
            }
            int p = 1;
            for (int j = 1; j <= i ; j++, p++) {
                System.out.print(p);
            }


            for (int j = 2; j <= i; j++, p--) {
                System.out.print(p-2);
            }
            System.out.println();
        }
    }
}
