import com.calulatorPackage.calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class productNullTests {
    @Test
    public void productNullTests(){
        Assert.assertThrows(NullPointerException.class, () -> calculator.product(null, null));
        Assert.assertThrows(NullPointerException.class, () -> calculator.product(5, null));
        Assert.assertThrows(NullPointerException.class, () -> calculator.product(null, 5));
    }
}
