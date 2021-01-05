package com.MBugajski.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    private final List<Continent> theWorld = new ArrayList<>();

    public World(List<Continent> list) {
        list.stream().forEach(c -> this.theWorld.add(c));
    }

    public BigDecimal getPeopleQuantity() {
        return theWorld.stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
