//5
//44
//333
//2222
//11111


        package NumberPattern;

public class RightHandedWithNumDes {
    public static void main(String[] args) {
        int number = 0;
        for (int i = 1; i <= 5 ; i++, number++) {
            for (int j = 1; j <= i ; j++) {

                System.out.print(5-number);
            }
            System.out.println();
        }
    }
}
