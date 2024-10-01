package gr.aueb.cf.ch5;

public class MinArray2 {
    public static void main(String[] args) {
        int [] arr = {28,13,4,55};
        int minPosition=0;

        minPosition = getMinPosition(arr);
        if (minPosition == -1) {
            System.out.println("error in searching");
        }

        System.out.printf("min value :%d, minPosition : %d ", arr[minPosition], minPosition) ;
    }

    public static int getMinPosition(int[] arr) {
        if (arr == null)
            return -1;
        int minPosition = 0;
        int min = arr[0];

        for (int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
                minPosition = i;
            }
        }
        return minPosition;
    }
}
