⚠️ Warning: Unrelated to library system
⚠️ Warning: In different package
🔧 Suggestion: Remove or move to separate project
🔧 Suggestion: Add division by zero handling
    
package SimpleCalculator;

public class SimpleCalculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }
}
