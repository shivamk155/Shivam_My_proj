package sorting;

import java.util.Date;
import java.util.Objects;

public class Countries {
    String name;

    @Override
    public String toString() {
        return "Countries{" +
                "name='" + name + '\'' +
                ", gdp=" + gdp +
                ", birthDate=" + birthDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Countries countries = (Countries) o;
        return name.equals(countries.name) &&
                gdp.equals(countries.gdp) &&
                birthDate.equals(countries.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gdp, birthDate);
    }

    public Countries(String name, Integer gdp, Date birthDate) {
        this.name = name;
        this.gdp = gdp;
        this.birthDate = birthDate;
    }

    Integer gdp;
    Date birthDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGdp() {
        return gdp;
    }

    public void setGdp(Integer gdp) {
        this.gdp = gdp;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
