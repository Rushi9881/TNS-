package Day14.SingleDimension;

import java.util.Arrays;

public class ArrayClassDemo {
    public static void main(String[] args) {
        int arr[] = { 54,264,798,46,887};
        int arr1[] = { 65,20,70,98,65};
        // System.out.println(Arrays.toString(arr));
        // It will give output
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        //sort
        Arrays.sort(arr);
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr));

        //Binary Search
        int key = 798;
        System.out.println(Arrays.binarySearch(arr, key));
        System.out.println(Arrays.binarySearch(arr, 0, 5, key));

        //Comparision
        System.out.println(Arrays.toString(arr1));

        //compare both the arrays
        if(Arrays.compare(arr, arr1)==0){
            System.out.println("Both the arrays matches");
        }
        else{
            System.out.println("Arrays are not same");
        }

        //Copy array
        int arr2[] = Arrays.copyOf(arr1, 2);
        System.out.println(Arrays.toString(arr2));

        //With range
        int arr3[]= Arrays.copyOfRange(arr1, 0, 5);
        System.out.println(Arrays.toString(arr3));


    }
    
}
