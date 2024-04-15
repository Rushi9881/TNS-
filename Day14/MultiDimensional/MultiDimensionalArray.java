package Day14.MultiDimensional;

import java.util.Arrays;

class MyArray{
    static void print(int a [] []){
        System.out.println(Arrays.toString(a));
        for(int i=0; i< a.length; i++){
            for(int j = 0; j<a.length; j++){
                System.out.println(a[i][j]); 
            }
            System.out.println();
        }
    }
}

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int a[][]= {{10,100,40},{20,20,200},{30,30,300}}; //New array int [3][3]
 
        MyArray.print(a);



    }
    
}
