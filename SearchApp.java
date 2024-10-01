package gr.aueb.cf.ch5;

/**
 * Search for an element, (dont know the position)
 */
public class SearchApp {

    public static void main(String[] args) {
        final int SECRET = 9;
        int [] arr = {1,2,3,5,7,9};
        boolean isFound = false;
        int count = 0;
        int position = -1;

        for (int i = 0; i < arr.length; i++ ){
            if (arr[i] == SECRET) {
                isFound = true;

                break;

            }
            count++;
            System.out.println("array count:" + count);
            System.out.println("array is found: " + isFound);

        }
            if(isFound){
                //System.out.println("array count:" + count);
                System.out.println("array is found: " + isFound);
            }   else {
                System.out.println("NOT FOUND");
            }
    }
}
