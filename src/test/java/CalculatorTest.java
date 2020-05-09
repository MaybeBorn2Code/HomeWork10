import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeClass
    public void initCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void sumLongTest() {
        long result = calculator.sum(3, 4);
        Assert.assertEquals(result, 7);
    }

    @Test
    public void sumDoubleTest() {
        double result = calculator.sum(4.4, 6.3);
        Assert.assertEquals(result, 10.7);
    }

    @Test
    public void subLongTest() {
        long result = calculator.sub(5, 4);
        Assert.assertEquals(result, 1);
    }

    @Test
    public void subDoubleTest() {
        double result = calculator.sub(10.1, 5.1);
        Assert.assertEquals(result, 5);
    }

    @Test
    public void multLongTest() {
        long result = calculator.mult(10, 5);
        Assert.assertEquals(result, 50);
    }

    @Test
    public void multDoubleTest() {
        double result = calculator.mult(10.1, 5.1);
        Assert.assertEquals(result, 51.0);
    }


    @Test
    public void divLongTest() {
        long result = calculator.div(55, 11);
        Assert.assertEquals(result, 5);
    }


    @Test
    public void divDoubleTest() {
        double result = calculator.div(5.1, 5.1);
        Assert.assertEquals(result, 1);
    }

    @Test
    public void powDoubleTest() {
        double result = calculator.pow(5.1, 2);
        Assert.assertEquals(result, 26.009999999999998);
    }

    @Test
    public void sqrtTest() {
        double result = calculator.sqrt(4);
        Assert.assertEquals(result, 2);
    }

    @Test
    public void tgTest() {
        double result = calculator.tg(30);
        Assert.assertEquals(result, 1.0);
    }

    @Test
    public void ctgTest() {
        double result = calculator.ctg(60);
        Assert.assertEquals(result, 1.0);
    }

    @Test
    public void cosTest() {
        double result = calculator.cos(1);
        Assert.assertEquals(result, 0.8414709848078965);
    }

    @Test
    public void sinTest() {
        double result = calculator.sin(10);
        Assert.assertEquals(result, -0.5440211108893698);
    }

    @Test
    public void positiveNumberTest() {
        boolean result = calculator.isPositive(4536);
        Assert.assertTrue(result);
    }

    @Test
    public void negativeNumberTest() {
        boolean result = calculator.isNegative(-42534);
        Assert.assertTrue(result);
    }
}