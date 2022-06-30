package e1_10.e2;

import java.util.stream.Stream;

public class E2 {

    public static void main(String[] args) {
        int result = Stream.iterate(Fibonacci.of(1, 2), Fibonacci::next)
                        .map(Fibonacci::previous) // always map the previous value as the example states
                        .takeWhile(v -> v < 4_000_000)
                        .filter(v -> v % 2 == 0)
                        .reduce(0, Integer::sum);

        System.out.println(result);
    }
}
