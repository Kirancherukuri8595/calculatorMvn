import com.calulatorPackage.calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class additionTest {


    @Test
    public void additionTest(){
        double result = calculator.add(5,6);
        double expected = 11;
        Assert.assertEquals(expected,result);
    }

}