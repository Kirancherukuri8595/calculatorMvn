import com.calulatorPackage.calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class divisionZeroTest {
    @Test
    public void divisionZeroTest(){
        Assert.assertThrows(ArithmeticException.class, () -> calculator.division(3, 0));
    }

    @Test
    public void divisionZeroTest2(){
        Integer result = calculator.division(0,3);
        Integer expected = 0;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void divisionZeroTest3(){
        Assert.assertThrows(ArithmeticException.class, () -> calculator.division(0, 0));
    }
}
