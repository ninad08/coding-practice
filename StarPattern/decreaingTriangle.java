//*****
//****
//***
//**
//*

package StarPattern;

public class decreaingTriangle {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
