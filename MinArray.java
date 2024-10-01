package gr.aueb.cf.ch5;

/**
 *
 */
public class MinArray {
    public static void main(String[] args) {

        int [] arr = {7,3,9,6,2,12};
        int minPosition ;
        minPosition = findMin(arr); //περνάμε το όνομα του πίνακα ως πραγματική μεταβλητή(χωρίς αγκύλες)
        System.out.printf("min value %d, min position %d", arr[minPosition], minPosition);
    }


    public static int findMin(int[] arr) {      //εδώ η παράμετρος είναι πίνακας

        int min = Integer.MAX_VALUE;
        int minPosition = 0;

        for(int i = 0; i < arr.length; i++){
            if( arr[i] < min) {
                minPosition = i;
            }
        }   return minPosition;
    }
}
