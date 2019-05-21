import com.calulatorPackage.calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class remainderTest {
    @Test
    public void remainderTest(){
        Integer result = calculator.remainder(7,2);
        Integer expected = 1;
        Assert.assertEquals(expected,result);
    }
}
