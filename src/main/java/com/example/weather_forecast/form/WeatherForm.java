package com.example.weather_forecast.form;

public class WeatherForm {

    private String city;

    public WeatherForm() {
    }

    public WeatherForm(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "WeatherForm [city=" + city + "]";
    }

}
