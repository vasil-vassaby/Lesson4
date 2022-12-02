package weatherApi;

import weatherApi.weather.Weather;

public class WeatherService implements Repository {

    Connection connection;
    Formatter formatter;

    public WeatherService() {
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
