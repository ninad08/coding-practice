//Common elements in two string arrays

package ArrayProblems;

public class commonStringElements {
    public static void main(String[] args) {
        String[] array1 = {"java", "python", "dbms", "oops", "cn"};
        String[] array2 = {"database,","java", "hello", "asp.net","oops"};
        int i , j;

        for (i=0; i < array1.length; i++) {
            for (j=0 ; j < array2.length; j++) {

                if (array1[i].equals(array2[j])) {

                    System.out.println("common elements : " + array1[i]);
                }
            }
        }
    }
}
