public class CurrentConditionDisplay implements Display, Observer {

    /// Attributes ///
    private float temperature;
    private float humidity;
    private Subject weatherData;

    // Constructor ///
    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
    @Override
    public void display() {
        System.out.printf("Current condition: %.1f F degrees and %.1f humidity\n",
                temperature, humidity);
    }
}
