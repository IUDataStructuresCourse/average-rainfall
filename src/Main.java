import java.util.ArrayList;

public class Main {

    public static double average_rainfall(int[] rainfall) {
       // put your code here
        throw new UnsupportedOperationException("not implemented yet!");
    }

    public static void main(String []args) {
        try {
            assert false;
            System.out.println("Problem! Enable exceptions with VM options: -ea");
            java.lang.System.exit(-1);
        } catch (java.lang.AssertionError e) { }

        {
            int A[] = {1,2,3};
            double average = average_rainfall(A);
            assert average == 2.0;
        }
        // add three more tests here

        System.out.println("tests passed");
    }
}
