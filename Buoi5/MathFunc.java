

public class MathFunc {
    public static int calls = 0;

    public int plus(int a, int b) {
        calls++;
        return a + b;
    }

    public int factorial(int n) {
        calls++;
        if (n < 0) {
            throw new IllegalArgumentException("Number must be >= 0");
        }
        if (n == 0) return 1;

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
