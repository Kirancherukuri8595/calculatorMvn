import com.calulatorPackage.calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class remNegativeTests {
    @Test
    public void remNegativeTest(){
        Integer result = calculator.remainder(-7,2);
        Integer expected = -1;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void remNegativeTest2(){
        Integer result = calculator.remainder(7,-2);
        Integer expected = 1;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void remNegativeTest3(){
        Integer result = calculator.remainder(-7,-2);
        Integer expected = -1;
        Assert.assertEquals(expected,result);
    }
}
