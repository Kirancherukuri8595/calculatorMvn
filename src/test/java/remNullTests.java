import com.calulatorPackage.calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class remNullTests {
    @Test
    public void remNullTest(){
        Assert.assertThrows(NullPointerException.class, () -> calculator.remainder(null, 0));
    }

    @Test
    public void remNullTest2(){
        Assert.assertThrows(ArithmeticException.class, () -> calculator.remainder(0, null));
    }

    @Test
    public void remNullTest3(){
        Assert.assertThrows(ArithmeticException.class, () -> calculator.remainder(null, null));
    }
}
