package weatherApi;

import weatherApi.weather.Weather;

public class WeatherRepository implements Repository {

    Connection connection;
    Formatter formatter;

    public WeatherRepository() {
        connection = new Connection();
        formatter = new Formatter();
    }

    @Override
    public String get(String city) {
        String info = connection.getInfo(city);
        Weather weather = formatter.parse(info);
        return weather.toString();
    }
}
