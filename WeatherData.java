import java.util.ArrayList;
import java.util.List;
public class WeatherData {
    private double temperature;
    private double humidity;

    public WeatherData(double temperature, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
}
    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }
    public void setWeatherData(double temperature, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();
    }
    // Список наблюдателей
    private List<WeatherObserber> observers = new ArrayList<>();

    // Методы для добавления и удаления наблюдателей
    public void addObserver(WeatherObserber observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherObserber observer) {
        observers.remove(observer);
    }

    // Метод для уведомления наблюдателей
    public void notifyObservers() {
        for (WeatherObserber observer : observers) {
            observer.update(this);
        }
    }
}