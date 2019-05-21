import com.calulatorPackage.calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class remZeroTests {
    @Test
    private void remZeroTest(){
        Assert.assertThrows(ArithmeticException.class, () -> calculator.remainder(4, 0));
    }

    @Test
    public void remZeroTest2(){
        Integer result = calculator.remainder(0,4);
        Integer expected = 0;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void remZeroTest3(){
        Assert.assertThrows(ArithmeticException.class, () -> calculator.remainder(0, 0));
    }
}
