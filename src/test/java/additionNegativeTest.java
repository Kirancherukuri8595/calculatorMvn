import com.calulatorPackage.calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class additionNegativeTest {
    @Test
    public void additionNegativeTest(){
        Integer result = calculator.add(-2,3);
        Integer expected = 1;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void additionNegativeTest2(){
        Integer result = calculator.add(-2,1);
        Integer expected = -1;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void additionNegativeTest3(){
        Integer result = calculator.add(-3,-2);
        Integer expected = -5;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void additionNegativeTest4(){
        Integer result = calculator.add(2,-3);
        Integer expected = -1;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void additionNegativeTest5(){
        Integer result = calculator.add(-6,3);
        Integer expected = -3;
        Assert.assertEquals(expected,result);
    }
}
