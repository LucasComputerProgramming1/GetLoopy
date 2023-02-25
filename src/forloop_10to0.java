public class forloop_10to0 {
    public static void main(String[] args) {
        //Declaring Variables
        int cnt = 1;
        int output = cnt;
        //For Loop 10-0 Skipping 2 - Start
        for (cnt=10; cnt >= 0; cnt = cnt - 2)
        {
            output = cnt + 1;
            System.out.println(cnt);
        }
    }
}