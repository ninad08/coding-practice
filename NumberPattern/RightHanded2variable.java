//1
//22
//111
//2222
//11111


package NumberPattern;

public class RightHanded2variable {
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <= i ; j++) {
                if (i % 2 != 0){
                    System.out.print(1);
                }else {
                    System.out.print(2);
                }
            }

            System.out.println();
        }
    }
}
