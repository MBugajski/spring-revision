package com.MBugajski.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    private final List<Country> theCountryList = new ArrayList<>();

    public Continent(List<Country> list) {
        list.stream().forEach(c -> this.theCountryList.add(c));
    }

    public List<Country> getCountryList() {
        return new ArrayList<>(theCountryList);
    }
}
