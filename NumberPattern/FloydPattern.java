//1
//23
//456
//78910


package NumberPattern;

public class FloydPattern {
    public static void main(String[] args) {
        int p = 1;
        for (int i = 1; i <= 4 ; i++) {
            for (int j = 1; j <= i ; j++,p++) {
                System.out.print(p);
            }

            System.out.println();
        }
    }
}
