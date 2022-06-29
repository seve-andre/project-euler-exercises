package e1_10.e1;

import java.util.stream.IntStream;

public class E1 {

    public static void main(String[] args) {
        // from 3 to 999
        // we skip 0, 1, 2 since are not relevant
        int result = IntStream.range(3, 1000)
                .filter(i -> i % 3 == 0 || i % 5 == 0)
                .reduce(0, Integer::sum);

        System.out.println(result);
    }
}
