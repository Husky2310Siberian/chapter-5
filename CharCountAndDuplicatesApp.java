package gr.aueb.cf.ch5;

import java.io.IOException;

/**
 * Counts the amount of letters
 * and dublicates letters, until # (ending)
 */
public class CharCountAndDuplicatesApp {

    public static void main(String[] args) throws IOException {

        int count = 0;
        int duplicate = 0;
        char inputChar = ' ';
        char previousChar = '\u007f';

        do {
            inputChar = (char) System.in.read();

            if (inputChar == '#'){
                break;
            } count++;

            if ( inputChar == previousChar) {
                duplicate++;
            }

            previousChar = inputChar;

        }while (true);

        System.out.println("count: " + count);      // αν εγραφα το println πανω απο to while, θα εκτύπωνε ενα - ενα τα count και duplicates
        System.out.println("duplicate: " + duplicate);
    }
}