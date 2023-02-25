public class PartB_5to1 {
    public static void main(String[] args) {
        //Declaring Variables
        int row;
        int col;
        //For Loop 5 to 1
        for (row=1; row <= 5; row++)
        {
            //Nested For Loop
            for(col=row; col<=5; col++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
