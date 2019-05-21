import com.calulatorPackage.calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class subNullTests {
    @Test
    public void subNullTests(){
        Assert.assertThrows(NullPointerException.class, () -> calculator.subtraction(null, null));
        Assert.assertThrows(NullPointerException.class, () -> calculator.subtraction(5, null));
        Assert.assertThrows(NullPointerException.class, () -> calculator.subtraction(null, 5));
    }


}
