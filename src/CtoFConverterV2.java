import java.util.Scanner;

public class CtoFConverterV2 {
    public static void main(String[] args) {
        //Declaring Variables
        double input = 0;
        double converted = 0;
        boolean done = false;
        String trash = "";
        String YN = "";
        Scanner in = new Scanner(System.in);
        do {
            //Prompt For Input
            System.out.println("This is a degrees celsius to fahrenheit converter. Please enter your temperature in degrees celsius: ");
            //Input Celsius
            System.out.print("");
            if (in.hasNextDouble()) {
                input = in.nextDouble();
                in.nextLine(); //Clear Input
                converted = input * 1.8 + 32;
                //Output Converted
                System.out.println("Your temperature in fahrenheit is " + converted);
                System.out.println("Would you like to convert again? Please enter Y for yes and N for no.");
                YN = in.nextLine();
                if(YN.equalsIgnoreCase("N"))
                {
                    done = true; //Restart Loop
                }
                else
                {
                    done = false; //End Program
                }
            }
            else {
                trash = in.nextLine();
                System.out.println("You entered an invalid input, please try again.");
            }
        }
        while (!done);
    }
}
