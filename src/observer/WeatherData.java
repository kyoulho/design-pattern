package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private final List<Observer> observerPushes;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observerPushes = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observerPush) {
        observerPushes.add(observerPush);
    }

    @Override
    public void removeObserver(Observer observerPush) {
        observerPushes.remove(observerPush);
    }

    @Override
    public void notifyObservers() {
        for (Observer observerPush : observerPushes) {
            // 풀 방식으로 구현한다.
            observerPush.update();
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
