package gr.aueb.cf.ch5;

/**
 * find a number in an array with search method
 */
public class SearchArrayWithMethod {

    public static void main(String[] args) {
        int[] quantities = {200, 300, 100};
        int position = 0;
        int value = 100;

        position = getElementPosition(quantities, value);
        System.out.printf("the position : %d is for  value : %d  :", position , value); // (...:", position , quantities[position])

    }

    public static int getElementPosition(int[] arr, int value) {
        if (arr == null || arr.length == 0) return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1 ;
    }
}