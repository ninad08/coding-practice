//12345
// 1234
//  123
//   12
//    1




package NumberPattern;

public class DecreasingPTriangleNum {
    public static void main(String[] args) {
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(" ");
            }
            int p = 1;
            for (int j = i; j <= 5 ; j++, p++) {
                System.out.print(p);
            }
            System.out.println();
        }
    }
}
