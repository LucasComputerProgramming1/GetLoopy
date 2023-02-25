public class PartB_1to5 {
    public static void main(String[] args) {
        //Declaring Variables
        int row;
        int col;
        //For Loop 1 to 5
        for (row=0; row < 5; row++)
        {
            //Nested For Loop
            for(col=0; col<=row; col++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
