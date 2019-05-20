import com.calulatorPackage.calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class remainderTest {
    @Test
    public void remainderTest(){
        double result = calculator.remainder(7,2);
        double expected = 1;
        Assert.assertEquals(expected,result);
    }
}
