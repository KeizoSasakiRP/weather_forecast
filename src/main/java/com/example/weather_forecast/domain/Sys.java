package com.example.weather_forecast.domain;

public class Sys {
    private String pod;

    public String getPod() {
        return pod;
    }

    public void setPod(String pod) {
        this.pod = pod;
    }

    @Override
    public String toString() {
        return "Sys [pod=" + pod + "]";
    }

}
