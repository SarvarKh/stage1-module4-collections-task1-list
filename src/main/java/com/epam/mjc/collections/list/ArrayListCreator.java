package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public static void main(String[] args) {
        List<String> sourceList = new ArrayList<>(List.of("I", "love", "you"));
        ArrayListCreator arrayListCreator = new ArrayListCreator();
        arrayListCreator.createArrayList(sourceList);
    }
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> result = new ArrayList<>();
        if (sourceList.size() < 3) {
            return new ArrayList<>();
        } else {
            for (int i = 0; i < sourceList.size(); i++) {
                 if ((i+1) % 3 == 0) {
                     result.add(sourceList.get(i));
                     result.add(sourceList.get(i));
                 }
            }
        }
        return result;
    }
}
