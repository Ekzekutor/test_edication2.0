package ru.test.qa;

import java.util.List;
import java.util.stream.Collectors;

public class Sorter {
    public List<Integer> sort(List<Integer> unsortedList){
        return unsortedList.stream().sorted().collect(Collectors.toList());
    }
}
