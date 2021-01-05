package com.MBugajski.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testTheWorld() {
        //Given
        List<Country> countriesInEurope = new ArrayList<>();
        countriesInEurope.add(new Country("United Kingdom", new BigDecimal("66534881")));
        countriesInEurope.add(new Country("Poland", new BigDecimal("38111098")));
        countriesInEurope.add(new Country("Germany", new BigDecimal("82276094")));
        countriesInEurope.add(new Country("France", new BigDecimal("65209341")));

        List<Country> countriesInAsia = new ArrayList<>();
        countriesInAsia.add(new Country("China", new BigDecimal("1414524501")));
        countriesInAsia.add(new Country("India", new BigDecimal("1352644698")));
        countriesInAsia.add(new Country("Laos", new BigDecimal("6951442")));
        countriesInAsia.add(new Country("Yemen", new BigDecimal("28852028")));

        List<Country> countriesInAfrica = new ArrayList<>();
        countriesInAfrica.add(new Country("Egypt", new BigDecimal("99202713")));
        countriesInAfrica.add(new Country("Eritrea", new BigDecimal("5176616")));
        countriesInAfrica.add(new Country("Congo", new BigDecimal("5386640")));
        countriesInAfrica.add(new Country("Mali", new BigDecimal("19053719")));

        List<Continent> continentsInTheWorld = new ArrayList<>();
        continentsInTheWorld.add(new Continent(countriesInEurope));
        continentsInTheWorld.add(new Continent(countriesInAsia));
        continentsInTheWorld.add(new Continent(countriesInAfrica));

        World theWorld = new World(continentsInTheWorld);

        //When
        BigDecimal worldPopulation = theWorld.getPeopleQuantity();

        //Then
        BigDecimal expectedWorldPopulation = new BigDecimal("3183923771");
        Assert.assertEquals(expectedWorldPopulation, worldPopulation);
    }
}
