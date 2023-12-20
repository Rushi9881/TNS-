public class NestedForloop {
    public static void main(String[] args) {
        // Nested for loop
        int beg = 10;
        int end = 10;
        for (int i = beg; i <=end; i++)
        {
            for (int j = 1; j<=10 ; j++)
            {
                System.out.println(i + " * " + j + " = " + i*j);
            }
        }
        System.out.println();
        
    }
    
}
