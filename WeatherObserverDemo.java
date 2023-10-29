public class WeatherObserverDemo {
    public static void main(String[] args) {
        // Создаем объект данных о погоде
        WeatherData weatherData = new WeatherData(25.0, 60.0);

        // Создаем несколько пользователей (наблюдателей)
        WeatherApp app1 = new WeatherApp("Приложение 1");
        WeatherApp app2 = new WeatherApp("Приложение 2");

        // Регистрируем пользователей
        weatherData.addObserver(app1);
        // Обновляем данные о погоде
        weatherData.setWeatherData(27.5, 55.0);
        weatherData.addObserver(app2);
        weatherData.setWeatherData(30.0, 70.0);

    }

}