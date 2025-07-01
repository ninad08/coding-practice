
//1
//11
//111
//1111
//11111

package NumberPattern;

public class RightHanded {
    public static void main(String[] args) {
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("1");
            }
            System.out.println();
        }
    }
}
