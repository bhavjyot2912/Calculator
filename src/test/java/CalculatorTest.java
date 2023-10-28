import org.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    private Main calculator;
    private static final double dx = 1e-15;

    @Before
    public void setUp(){
        calculator = new Main();
    }

    @Test
    public void addNumber_test_right(){
        int a = 1;
        int b = 2;
        int groundTruth = 3;
        Assert.assertEquals(groundTruth, calculator.addNumbers(a, b));
    }

    @Test
    public void addNumber_test_wrong(){
        int a = 2;
        int b = 2;
        int groundTruth = 3;
        Assert.assertNotEquals(groundTruth, calculator.addNumbers(a, b));
    }

    @Test
    public void subNumber_test_right(){
        int a = 1;
        int b = 2;
        int groundTruth = -1;
        Assert.assertEquals(groundTruth, calculator.subNumbers(a, b));
    }

    @Test
    public void subNumber_test_wrong(){
        int a = 2;
        int b = 2;
        int groundTruth = 3;
        Assert.assertNotEquals(groundTruth, calculator.subNumbers(a, b));
    }

    @Test
    public void mulNumber_test_right(){
        int a = 1;
        int b = 2;
        int groundTruth = 2;
        Assert.assertEquals(groundTruth, calculator.mulNumbers(a, b));
    }

    @Test
    public void mulNumber_test_wrong(){
        int a = 2;
        int b = 2;
        int groundTruth = 3;
        Assert.assertNotEquals(groundTruth, calculator.mulNumbers(a, b));
    }

    @Test
    public void divNumber_test_right(){
        int a = 10;
        int b = 2;
        double groundTruth = 5.0;
        Assert.assertEquals(groundTruth, calculator.divNumbers(a, b), dx);
    }

    @Test
    public void divNumber_test_wrong(){
        int a = 10;
        int b = 2;
        double groundTruth = 3;
        Assert.assertNotEquals(groundTruth, calculator.divNumbers(a, b), dx);
    }

    @Test
    public void divNumber_test_wrong_io(){
        int a = 10;
        int b = 0;
        double groundTruth = 1e9;
        Assert.assertEquals(groundTruth, calculator.divNumbers(a, b), dx);
    }
}
