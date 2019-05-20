import com.calulatorPackage.calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class subTest {
    @Test
    public void subTest(){
        double result = calculator.subtraction(-5,5);
        double expected = -10;
        Assert.assertEquals(expected,result);
    }
}
