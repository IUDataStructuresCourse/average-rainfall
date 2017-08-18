
public class Main {

    public static double average_rainfall(int[] rainfall) {
        // implement this function
        return 0.0;
    }

    public static void main(String []args) {
        // Sanity check that -ea flag is enabled for 'assert'.
        try {
            assert false;
            System.out.println("Problem! Enable 'assert' with VM options: -ea");
            java.lang.System.exit(-1);
        } catch (java.lang.AssertionError e) { }

        {
            int A[] = {1,2,3};
            double average = average_rainfall(A);
            assert average == 2.0;
        }

        System.out.println("tests passed");
    }
}

