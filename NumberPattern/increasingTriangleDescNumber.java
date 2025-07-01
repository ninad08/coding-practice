//5
//54
//543
//5432
//54321




        package NumberPattern;

public class increasingTriangleDescNumber {
    public static void main(String[] args) {
        for (int i = 1; i <= 5 ; i++) {
            int p = 5;
            for (int j = 1; j <= i ; j++, p--) {
                System.out.print(p);
            }
            System.out.println();
        }
    }
}
