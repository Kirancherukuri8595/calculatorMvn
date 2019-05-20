import com.calulatorPackage.calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class productTest {

    @Test
    public void productTest(){
        double result = calculator.product(3,4);
        double expected = 12;
        Assert.assertEquals(expected,result);
    }
}
