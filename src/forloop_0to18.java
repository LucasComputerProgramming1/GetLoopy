public class forloop_0to18 {
    public static void main(String[] args) {
        //Declaring Variables
        int cnt = 1;
        int output = cnt;
        //For Loop 0-18 Skipping 3 - Start
        for (cnt=0; cnt <= 18; cnt = cnt + 3)
        {
            output = cnt + 1;
            System.out.println(cnt);
        }
    }
}
