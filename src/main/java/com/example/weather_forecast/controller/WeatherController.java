package com.example.weather_forecast.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.example.weather_forecast.domain.ForecastItem;
import com.example.weather_forecast.domain.WeatherData;
import com.example.weather_forecast.domain.WeatherForecast;
import com.example.weather_forecast.form.WeatherForm;

@Controller
@RequestMapping("")
public class WeatherController {

    // APIアクセストークン
    private static final String API_KEY = "YOUR_API_KEY";
    // APIエンドポイント
    private static final String API_ENDPOINT = "http://api.openweathermap.org/data/2.5/forecast";

    @GetMapping("/weather")
    public String showWeatherForm() {
        return "weather_search";
    }

    @PostMapping("/search")
    public String getWeatherData(WeatherForm weatherForm, Model model) {
        String city = weatherForm.getCity();
        RestTemplate restTemplate = new RestTemplate();
        String apiUrl = String.format("%s?q=%s&appid=%s&units=metric&lang=ja", API_ENDPOINT, city, API_KEY);
        WeatherForecast weatherForecast = restTemplate.getForObject(apiUrl, WeatherForecast.class);

        List<WeatherData> weatherDataList = new ArrayList<>();
        for (ForecastItem forecastItem : weatherForecast.getList()) {
            WeatherData weatherData = new WeatherData();
            weatherData.setDtTxt(forecastItem.getDt_txt());
            weatherData.setTemp(forecastItem.getMain().getTemp());
            weatherData.setDescription(forecastItem.getWeather().get(0).getDescription());
            weatherData.setPop(forecastItem.getPop());
            weatherDataList.add(weatherData);
        }
        model.addAttribute("weatherForecastList", weatherDataList);
        model.addAttribute("city", weatherForecast.getCity().getName());

        return "weather_forecast";
    }

}
