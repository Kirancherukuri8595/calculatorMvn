import com.calulatorPackage.calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class additionTest {


    @Test
    public void additionTest(){
        Integer result = calculator.add(5,6);
        Integer expected = 11;
        Assert.assertEquals(expected,result);
    }

}