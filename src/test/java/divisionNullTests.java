import com.calulatorPackage.calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class divisionNullTests {
    @Test
    public void divisionNullTests(){
        Assert.assertThrows(NullPointerException.class, () -> calculator.division(null, null));
        Assert.assertThrows(NullPointerException.class, () -> calculator.division(5, null));
        Assert.assertThrows(NullPointerException.class, () -> calculator.division(null, 5));
    }
}
