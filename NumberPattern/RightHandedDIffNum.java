//0
//22
//444
//6666
//88888

package NumberPattern;

public class RightHandedDIffNum {
    public static void main(String[] args) {
        for (int i = 0; i < 5  ; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print(i * 2);
            }
            System.out.println();
        }
    }
}
