package gr.aueb.cf.ch5;

/**
 * Calculates the sum of digits of an int.
 * For example the sum of digits of  571 => 13
 */
public class SumOfDigitsApp {

    public static void main(String[] args) {
        int num = 123456789;
        int sumOfDigits = 0;

        sumOfDigits = addSumOfDigits(num);
        System.out.printf("sum pf digits of %d is %d :", num, addSumOfDigits(num));
    }

    /**
     * Gets the sum of digits of the input numbers
     * @param num the input number
     * @return  the sum of digits
     */
    public static int addSumOfDigits(int num){
        int left = num;
        int rightDigit = 0;
        int sum = 0;

        do {
            rightDigit = left % 10;
            left = left / 10;
            sum += rightDigit;

        } while (left != 0);
        return sum;
    }
}
