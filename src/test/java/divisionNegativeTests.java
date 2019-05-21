import com.calulatorPackage.calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class divisionNegativeTests {
    @Test
    public void divisionNegativeTest(){
        Integer result = calculator.division(-6,3);
        Integer expected = -2;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void divisionNegativeTest2(){
        Integer result = calculator.division(6,-3);
        Integer expected = -2;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void divisionNegativeTest3(){
        Integer result = calculator.division(-6,-3);
        Integer expected = 2;
        Assert.assertEquals(expected,result);
    }
}
