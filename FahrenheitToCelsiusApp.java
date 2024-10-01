package gr.aueb.cf.ch5;

/**
 * μετατρέπει βαθμούς F σε C
 */
public class FahrenheitToCelsiusApp {

    public static void main(String[] args) {

        for(int i = -100; i<= 100; i+=10) {
            System.out.printf("%4d\u2109\t=\t%6.2f\u2103\n", i , getCelFromFah(i));
        }
    }
    /**
     * Converts Fahrenheit to Celsius degrees
     * @param   fahrenheitDegrees
     *          the input ih Fahrenheit degrees
     *
     * @return
     *          celcius degrees after converting to from Fahrenheit.
     */
    public static double getCelFromFah(double fahrenheitDegrees) {
        return (fahrenheitDegrees - 32) * 5 / 9;            // οι ακεραιοι γίνονται αυτόματα promote σε double
    }
}
