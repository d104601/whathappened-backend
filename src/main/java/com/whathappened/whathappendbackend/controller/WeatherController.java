package com.whathappened.whathappendbackend.controller;

import com.whathappened.whathappendbackend.service.WeatherService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/weather")
@AllArgsConstructor
public class WeatherController {
    WeatherService weatherService;

    @GetMapping("/current")
    public String getCurrentWeather(@RequestParam String city) {
        return weatherService.getCurrentWeather(city);
    }

    @GetMapping("/forecast")
    public String getForecastWeather(@RequestParam String city) {
        return "forecast weather";
    }
}
