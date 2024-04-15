package Day14.MultiDimensional;

class MyArray{
     static void print(int a [][]){
        for(int i=0; i<a.length; i++){
            for (int j=0; j<a[i].length;j++){
                System.out.println(a[i][j]+"");
            }
         }
} 
}
public class jaggedArray {
    public static void main(String[] args) {
        //int a[][]= {{10,100,40},{20},{30,15},{98,81,63,87}};

        int data [][] = new int [4][];

        //row
        data[0][0]=10;
        data[0][1]=20;
        data[0][2]=30;

        //row1
        data[1][0]=10;
      

        //rows
        data[2][0]=10;
        data[2][1]=20;

        //row
        //rows
        data[4][0]=10;
        data[4][1]=20;
        data[4][2]=30;
        data[4][3]=80;

        System.out.println("total rows in array:"+data.length);

        MyArray.print(data);

    }
   
}
