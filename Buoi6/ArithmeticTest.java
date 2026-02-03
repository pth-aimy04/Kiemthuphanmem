package fploy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArithmeticTest {

    private String message = "Fpoly exception";
    private JUnitMessage junitMessage = new JUnitMessage(message);

    @Test(expected = ArithmeticException.class)
    public void testJunitMessage() {
        System.out.println("Fpoly JUnit Message exception is printing");
        junitMessage.printMessage(); // sẽ ném ArithmeticException => PASS
    }

    @Test
    public void testJunitHiMessage() {
        message = "Hi!" + message;
        System.out.println("Fpoly JUnit Message is printing");
        assertEquals(message, junitMessage.printHiMessage());
    }
}
