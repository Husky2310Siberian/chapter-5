package gr.aueb.cf.ch5;

/**
 * Searches for an array element and returns
 * the position if it is found, -1 otherwise
 */
public class SearchPositionApp {
    public static void main(String[] args) {

        int[] grades = {6, 3, 6, 8, 1, 10};
        final int EXCELLENT_GRADE = 10;
        int position = -1;

        for (int i = 0; i < grades.length; i++) {   // i is the number of array, 0,1,2,3,4,5, not the value
            if (grades[i] == EXCELLENT_GRADE) {
                position = i;
                break;
            }
        }
        if (position == -1) {
            System.out.println("NOT FOUND");
        } else {
            System.out.printf("the element %d found at position %d\n" , EXCELLENT_GRADE, position);
            System.out.printf("the element %d found at position %d\n" , EXCELLENT_GRADE, position + 1);
            System.out.printf("the value %d found at position %d" , grades[position], position +1);
        }
    }
}
