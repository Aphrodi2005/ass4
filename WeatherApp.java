class WeatherApp implements WeatherObserber {
    private String name;

    public WeatherApp(String name) {
        this.name = name;
    }

    @Override
    public void update(WeatherData weatherData) {
        System.out.println(name + " получил обновление погоды. Текущая температура: " +
                weatherData.getTemperature() + "°C, Влажность: " + weatherData.getHumidity() + "%");
    }
}
