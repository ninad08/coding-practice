//1
//22
//333
//4444
//55555
//4444
//333
//22
//1

package NumberPattern;

public class RightHandedTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        for (int i = 2; i <= 5 ; i++) {
            for (int j = i; j <= 5 ; j++) {
                System.out.print(6 - i);
            }
            System.out.println();
        }
    }
}
