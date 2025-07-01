//         1
//        123
//       12345
//      1234567
//     123456789


package NumberPattern;



public class hillWithIncreasingNumber {
    public static void main(String[] args) {
        for (int i = 1; i <= 5 ; i++) {
            for (int j = i; j <= 5 ; j++) {
                System.out.print(" ");
            }
            int p = 1;
            for (int j = 1; j <= i ; j++, p++) {
                System.out.print(p);
            }

            for (int j =2; j <= i ; j++,p++) {
                System.out.print(p);
            }
            System.out.println();


        }

    }
}
