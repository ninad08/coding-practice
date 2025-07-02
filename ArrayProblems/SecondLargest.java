//Find the second largest element in an array
package ArrayProblems;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {23,45,2,21,56,3278,43,90,67};
        int max = Integer.MIN_VALUE;
        int index = 0;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                index = i;
                max = arr[i];
            }
        }
        int temp = arr[arr.length-1];
        arr[arr.length-1] = arr[index];
        arr[index] = temp;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > secondMax){
                secondMax = arr[i];
            }
        }

        System.out.println("Second Largest Integer : " + secondMax);
    }
}
