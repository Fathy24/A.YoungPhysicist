import org.junit.Test;

import static org.junit.Assert.*;

public class MyClassTest {

    @Test
    public void equilibriumTestNO() {
        MyClass tester = new MyClass();
        assertEquals("no",tester.equilibrium());
    }
    @Test
    public void equilibriumTestYes() {
        MyClass tester = new MyClass();
        assertEquals("yes",tester.equilibrium());
    }
    @Test
    public void equilibriumTestThrowException() {
        MyClass tester = new MyClass();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    tester.equilibrium();
                });
    }
}