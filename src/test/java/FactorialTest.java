import org.junit.Assert;
import org.junit.Test;
import tested.Factorial;

public class FactorialTest {
    @Test
    public void factorialTest() {
        Assert.assertEquals(24,new Factorial().factorial(5));
    }
}
