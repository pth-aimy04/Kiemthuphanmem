package fploy;

public class JUnitMessage {
    private String message;

    public JUnitMessage(String message) {
        this.message = message;
    }

    // Hàm này cố tình gây ArithmeticException (chia cho 0)
    public void printMessage() {
        System.out.println(message);
        int divide = 1 / 0; // <-- sẽ ném ArithmeticException
    }

    public String printHiMessage() {
        message = "Hi!" + message;
        System.out.println(message);
        return message;
    }
}
