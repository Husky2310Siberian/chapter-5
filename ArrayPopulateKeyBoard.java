package gr.aueb.cf.ch5;

import java.util.Scanner;

public class ArrayPopulateKeyBoard {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[5];


        for(int i = 0; i < ages.length; i++) {
            System.out.println("Επέλεξε τον αρίθμό" + (i));
            ages[i] = sc.nextInt();
        }

        for(int i = 0; i < ages.length; i++){
            System.out.println(ages[i] + " ");
        }
        sc.close();
    }
}
