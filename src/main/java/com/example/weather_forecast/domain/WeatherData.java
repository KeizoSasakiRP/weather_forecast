package com.example.weather_forecast.domain;

public class WeatherData {

    private String dtTxt;
    private Double temp;
    private String description;
    private Double pop;

    public String getDtTxt() {
        return dtTxt;
    }

    public void setDtTxt(String dtTxt) {
        this.dtTxt = dtTxt;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPop() {
        return pop;
    }

    public void setPop(Double pop) {
        this.pop = pop;
    }

    @Override
    public String toString() {
        return "WeatherData [dtTxt=" + dtTxt + ", temp=" + temp + ", description=" + description + ", pop=" + pop + "]";
    }

}
