import org.junit.Assert;
import org.junit.Test;
import tested.MathOperations;

public class MathOperationsTest {
    @Test
    public void sum_1() {
        System.out.println("QQQQQQQQQQQQQQQQQQQQQQ");
        Assert.assertEquals(4, new MathOperations().sum(2, 2));
    }


    @Test
    public void sum_2() {
        Assert.assertEquals(8,new MathOperations().sum(6,2));
    }
}
