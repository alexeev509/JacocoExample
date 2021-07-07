import org.junit.Before;
import org.junit.Test;

public class TestIfElse {
//    @Before
//    public void befor(){
//        System.out.println("BEFORE");
//    }

//    @Test
//    public void ifElseTest() {
//        IfThen ifThen= new IfThen();
//        ifThen.twoBranches(6);
//    }

    @Test
    public void ifElseTest2() {
        IfThen ifThen= new IfThen();
        ifThen.twoBranches(0);
    }
//
//
//    @Test(expected = ArithmeticException.class)
//    public void divideTest() {
//        IfThen ifThen= new IfThen();
//        ifThen.divide(2,0);
//    }

    @Test
    public void divideTest2() {
        IfThen ifThen= new IfThen();
        ifThen.divide(2,2);
    }

    @Test
    public void divideTest3() {
        IfThen ifThen= new IfThen();
        ifThen.divide(2,2);
    }
}
//mvn clean compile compiler:testCompile test -Dtest=TestIfElse#divideTest3