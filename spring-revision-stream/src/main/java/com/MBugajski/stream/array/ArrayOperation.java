package com.MBugajski.stream.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public interface ArrayOperation {
    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .forEach(n -> System.out.println(numbers[n]));
        double average = IntStream.range(0, numbers.length)
                .map(n -> numbers[n]).average().getAsDouble();
        return average;
    }
}
