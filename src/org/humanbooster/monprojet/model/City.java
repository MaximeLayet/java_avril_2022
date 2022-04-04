package org.humanbooster.monprojet.model;

import java.util.Objects;

public class City {

    public String name;
    public String population;
    public String category;
    public boolean capital;
    private Country country;

    public City(String name, String population, boolean capital) {
        this.name = name;
        this.population = population;
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isCapital() {
        return capital;
    }

    public void setCapital(boolean capital) {
        this.capital = capital;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return capital == city.capital && Objects.equals(name, city.name) && Objects.equals(population, city.population) && Objects.equals(category, city.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, population, category, capital);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("City{");
        sb.append("name='").append(name).append('\'');
        sb.append(", population='").append(population).append('\'');
        sb.append(", category='").append(category).append('\'');
        sb.append(", capital=").append(capital);
        sb.append('}');
        return sb.toString();
    }
}
