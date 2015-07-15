import java.util.ArrayList;

public class WeatherData implements Subject{

    /// Attributes ///
    private ArrayList observers;
    private float humidity;
    private float pressure;
    private float temperature;

    public WeatherData() {
        observers = new ArrayList();
    }


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int observerCurrentIndex = observers.indexOf(observer);

        if (observerCurrentIndex >= 0) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer notifyThis = (Observer)observers.get(i);
            notifyThis.update(temperature, humidity, pressure);
        }
    }

    private void measurementsChanged() {
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;
        notifyObserver();
    }
}
