package e1_10.e2;

public record Fibonacci(int previous, int value) {

    public static Fibonacci of(int previous, int value) {
        return new Fibonacci(previous, value);
    }

    public Fibonacci next() {
        return new Fibonacci(value, value + previous);
    }
}
