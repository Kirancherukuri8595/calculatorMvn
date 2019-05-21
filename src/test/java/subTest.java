import com.calulatorPackage.calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class subTest {
    @Test
    public void subTest(){
        Integer result = calculator.subtraction(-5,6);
        Integer expected = -11;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void subTest2(){
        Integer result = calculator.subtraction(5,2);
        Integer expected = 3;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void subTest3(){
        Integer result = calculator.subtraction(2,5);
        Integer expected = -3;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void subTest4(){
        Integer result = calculator.subtraction(5,-6);
        Integer expected = 11;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void subTest5(){
        Integer result = calculator.subtraction(-5,-2);
        Integer expected = -3;
        Assert.assertEquals(expected,result);
    }
}
