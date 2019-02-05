package com.company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectorsExamples {

    public static void main(String[] args) {
        // Примеры использования готовых коллекторов

        // joining
        Stream<String> stringStream = Stream.of("1", "2", "3", "4");
        String joiningResult = stringStream.collect(Collectors.joining(", "));
        System.out.println(joiningResult);

        // avereging"Тип" - рез-т Double всегда
        stringStream = Stream.of("1", "2", "3", "4");
        double avg = stringStream.collect(Collectors.averagingInt(Integer::parseInt)); // To"Тип"Function
        System.out.println(avg);

        // counting -  рез-т Long
        stringStream = Stream.of("1", "2", "3", "4");
        long count = stringStream.collect(Collectors.counting());

        // maxBy/minBy
        stringStream = Stream.of("1", "2", "3", "4");
        Optional<String> min = stringStream.collect(Collectors.minBy(Comparator.naturalOrder()));
        Optional<String> max = stringStream.collect(Collectors.maxBy(Comparator.naturalOrder()));

        // toCollection
        stringStream = Stream.of("1", "2", "3", "4");
        ArrayList<String> stringArrayList = stringStream.collect(Collectors.toCollection(ArrayList::new)); // Supplier

        // summarizing"Тип" - рез-т "Тип"SummaryStatistics
        stringStream = Stream.of("1", "2", "3", "4");
        IntSummaryStatistics statistics = stringStream.collect(Collectors.summarizingInt(Integer::parseInt)); // To"Тип"Function

        // summing"Тип" - рез-т "Тип"
        stringStream = Stream.of("1", "2", "3", "4");
        int sum = stringStream.collect(Collectors.summingInt(Integer::parseInt)); // To"Тип"Function

        // toList/toSet (случайные реализации)
        List<String> list = Stream.of("1", "2", "3", "4").collect(Collectors.toList());
        Set<String> set = Stream.of("1", "2", "3", "4").collect(Collectors.toSet());

    }
}
