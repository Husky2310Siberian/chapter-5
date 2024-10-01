package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * the usser gives a sequence of integers , ending with zero
 * ant the program calculates the min, max , average
 */
public class MeanMaxAverageApp {

    public static void main(String[] args) {

        int count = 0;
        int num = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        while ((num = sc.nextInt()) != 0){      //οταν διαβάσει το μηδέν, σταματάει

            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }

            sum += num;

            count++;
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.printf("Average: %.2f" , ((double) sum / count));

    }


}
