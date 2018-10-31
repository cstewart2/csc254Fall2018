package com.noynaert.csc254;

public class WeatherStation {
    private String city;
    private int elevation;

    public WeatherStation(String city, int elevation){
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
}
