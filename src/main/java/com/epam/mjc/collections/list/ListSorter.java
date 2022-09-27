package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public static void main(String[] args) {
        ListSorter listSorter = new ListSorter();
        List<String> list = new ArrayList<>(List.of("7", "10", "6", "-7", "-2", "0", "-2", "-23"));
        listSorter.sort(list);
    }
    public void sort(List<String> sourceList) {
        Collections.sort(sourceList, new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    public int asecndingOrder(String n) {
        int nInt = Integer.valueOf(n);
        return (int)Math.pow(5 * nInt, 2) + 3;
    }

    @Override
    public int compare(String a, String b) {
        return asecndingOrder(a) - asecndingOrder(b);
    }
}
