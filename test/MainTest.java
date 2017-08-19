import junit.framework.TestCase;

public class MainTest extends TestCase {
    public void testAverage_rainfall() throws Exception {
        {
            int A[] = {1,2,3};
            double average = Main.average_rainfall(A);
            assertEquals(2.0, average);
        }
        // add 3 more tests here
    }

}