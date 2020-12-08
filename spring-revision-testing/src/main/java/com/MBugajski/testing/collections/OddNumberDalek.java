package com.MBugajski.testing.collections;

import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class OddNumberDalek {

    public static <T> Collector<T, ?, ArrayList<T>> toArrayList() {
        return Collectors.toCollection(ArrayList::new);
    }

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
      return numbers.stream().filter(i-> i%2 == 0).collect(toArrayList());
    };
}
