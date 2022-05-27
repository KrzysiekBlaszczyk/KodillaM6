package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Continent {
    private final List<Country> countries = new ArrayList<>();
    private final String name;

    public Continent(String name) {
        this.name = name;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public String getName() {
        return name;
    }
    public boolean addCountry(Country country){
        return countries.add(country);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return countries.equals(continent.countries) && name.equals(continent.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countries, name);
    }

    @Override
    public String toString() {
        return "Continent{" +
                "countries=" + countries +
                ", name='" + name + '\'' +
                '}';
    }
}
