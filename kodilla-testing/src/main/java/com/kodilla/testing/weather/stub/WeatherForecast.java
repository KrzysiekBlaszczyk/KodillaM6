package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public Double calculateAvg() {
        double result = 0;
        if (temperatures.getTemperatures().size() > 0) {
            for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
                result = result + temperature.getValue();
            }
            return result / temperatures.getTemperatures().size();
        } else {
            return null;
        }
    }

    public Double calculateMedian() {
        double median = 0;
        List<Double> temperaturesList = new ArrayList<>(temperatures.getTemperatures().values());
        if (temperaturesList.size() > 0) {
            Collections.sort(temperaturesList);
            if (temperaturesList.size() % 2 == 0) {
                median = (temperaturesList.get(temperaturesList.size() / 2)) + temperaturesList.get((temperaturesList.size() / 2) - 2);
            } else {
                median = temperaturesList.get(temperaturesList.size() / 2);
            }
        }
        return median;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeatherForecast that = (WeatherForecast) o;
        return temperatures.equals(that.temperatures);
    }

    @Override
    public int hashCode() {
        return Objects.hash(temperatures);
    }
}
