import org.junit.Before;
import org.junit.Test;

public class TestQ {
    @Before
    public void sayhello1(){
        System.out.println("Hello1");
    }

    @Before
    public void sayhello2(){
        System.out.println("Hello2");
    }
    @Test
    public void q() {
        Q m = new Q();
        System.out.println(this.getClass().getClassLoader());
        m.printQ();
    }

    @Test
    public void q2() {
        Q m = new Q();
        System.out.println(this.getClass().getClassLoader());
        m.printQ();
    }
}
