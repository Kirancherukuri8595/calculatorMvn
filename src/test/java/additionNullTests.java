import com.calulatorPackage.calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class additionNullTests {
    @Test
    public void additionNullTests(){
        Assert.assertThrows(NullPointerException.class, () -> calculator.add(null, null));
        Assert.assertThrows(NullPointerException.class, () -> calculator.add(5, null));
        Assert.assertThrows(NullPointerException.class, () -> calculator.add(null, 5));
    }
}
