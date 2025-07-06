package ArrayProblems;

public  class ZerosToEnd{
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 0, 3, 0, 5, 0, 6};

        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            if (arr[left] == 0 && arr[right] != 0){
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
                right--;

            } else if (arr[left] == 0 && arr[right] == 0) {
                right--;
            }else if(arr[left] != 0 && arr[right] == 0){
                left++;
            }

        }

        for (int i = 0;i < arr.length ;i++ ){
            System.out.println(arr[i]);
        }
    }
}