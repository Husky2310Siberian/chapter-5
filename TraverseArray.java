package gr.aueb.cf.ch5;

/**
 * Traverse an array means to visit each element
 * and print the value
 */
public class TraverseArray {

    public static void main(String[] args) {

        int[] ages = {22, 25, 26, 43};

        //simple for with index
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i] + " ");
        }

        //enhanced for, is safe - NO INDEX
        for (int age : ages) {
            System.out.println(age + " ");
        }
    }
}