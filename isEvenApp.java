package gr.aueb.cf.ch5;

/**
 * ελέγχει αν ένας ακεραιος είναι άρτιος ή οχι
 */
public class isEvenApp {

    public static void main(String[] args) {
        int num = 16;
        boolean isEven = false;

        isEven = isEven(num);
        System.out.printf("%d is even : %b \n", num, isEven);
        System.out.printf("%d is%seven", num, isEven ?" ": " not ");
    }

    /**
     * Returns true if the inout number is ever, or
     * false of the input number is odd
     *
     * @param num   the input number
     * @return      true if the input number is even, or false otherwise
     */
    public static boolean isEven (int num) {
        return num %2 == 0;         //could use if.....else...
    }
}
