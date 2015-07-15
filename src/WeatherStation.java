public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(60, 50, 21);
        weatherData.setMeasurements(30, 40, 22);
        weatherData.setMeasurements(50, 50, 100);
    }
}
