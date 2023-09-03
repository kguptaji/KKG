package package00;
import org.testng.annotations.Test;

public class SampleTestNGTest {

    @Test
    public void testAddition() {
        // Test data
        int a = 5;
        int b = 7;

        // Perform the test
        int result = a + b;
        System.out.println(result);
        // Assertion to check if the result is as expected
        assert result == 12 : "Addition failed: Expected 12, but got " + result;
    }
}
