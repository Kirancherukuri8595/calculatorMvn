import com.calulatorPackage.calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class divisionTest {
    @Test
    public void divisionTest(){
        double result = calculator.division(12,3);
        double expected = 4;
        Assert.assertEquals(expected,result);
    }
}
