package gr.aueb.cf.ch5;
/*
*   Populate => insert initial values into array
 */
public class PopulateArray {

    public static void main(String[] args) {

        int[] arr = new int[5]; //default values == zero

        //populate
        arr[0] = 1;
        arr[1] = 10;
        arr[2] = 20;
        arr[3] = 30;
        arr[4] = 60;

        System.out.println(arr[arr.length-2]);  //shows the value of arr[]

        //Unsized initialization

        int[] arr2 = {1,2,3,4,5,6};

        System.out.println(arr2[0]);
        System.out.println(arr2[arr2.length -1]);


        int[] arr3;
        arr3 = new int[] {1,2,3,4,5,6,7,8};   //array initializer
    }
}
