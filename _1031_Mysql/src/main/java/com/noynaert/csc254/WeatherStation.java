package com.noynaert.csc254;

import java.util.Objects;

public class WeatherStation implements Comparable<WeatherStation> {
    private String city;
    private int elevation;

    public WeatherStation(String city, int elevation) {
        this.city = city;
        this.elevation = elevation;
    }

    @Override
    public String toString() {
        return "WeatherStation{" +
                "city='" + city + '\'' +
                ", elevation=" + elevation +
                '}';
    }


    @Override
    public int compareTo(WeatherStation other) {
        int result = 0;

        String a = this.city.replace(".", "");
        String b = other.city.replace(".", "");
        //result = this.city.compareTo(other.city);
        result = a.compareTo(b);
        if (result == 0)
            result = this.elevation - other.elevation;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeatherStation that = (WeatherStation) o;
        return elevation == that.elevation &&
                Objects.equals(city, that.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, elevation);
    }
}
