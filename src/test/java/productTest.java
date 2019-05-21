import com.calulatorPackage.calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class productTest {

    @Test
    public void productTest(){
        Integer result = calculator.product(3,4);
        Integer expected = 12;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void productTest2(){
        Integer result = calculator.product(3,0);
        Integer expected = 0;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void productTest3(){
        Integer result = calculator.product(3,-3);
        Integer expected = -9;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void productTest4(){
        Integer result = calculator.product(-3,-3);
        Integer expected = 9;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void productTest5(){
        Integer result = calculator.product(-3,3);
        Integer expected = -9;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void productTest6(){
        Integer result = calculator.product(0,-3);
        Integer expected = 0;
        Assert.assertEquals(expected,result);
    }
}
