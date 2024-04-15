package Day14.SingleDimension;

class ArrayOperations{
    //method to Print int array
    static void print(int[] arr){
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]+ "\t");
        }
    }

    //variable argument function
    public static int getSum(int...  n){
        int sum=0;
        for(int no : n)
        sum += no;
        return sum;
    }
    //count no of odd elements
    public static int getOddCount(int b[]){
        int count = 0;
        for(int i =0;i < b.length; i++){
            if(b[i] % 2 !=0)
            count++;        }
        return count;

    }
    //count no of even elements
    public static int getEvenCount(int b[]){
        return b.length-getOddCount(b);
    }
}

public class ArrayDemoOne {
    public static void main(String[] args) {
        int n = 10;
        int a[];
        a = new int[n];

        //displaying the array
        ArrayOperations.print(a);

        //Assigning values in array
        for (int i =0; i<a.length; i++)
        a[i] = 5*i;

        ArrayOperations.print(a);

        //calling variable argument function
        System.out.println("Sum of array Element is:"+ ArrayOperations.getSum(a));
        System.out.println("sum of array element:"+ArrayOperations.getSum(10,20,40));

        //Display count of odds and even in array
        System.out.println("Odd Numbers:"+ ArrayOperations.getOddCount(a)+"\nEven Numbers:"+ArrayOperations.getEvenCount(a));


    }
    
}
