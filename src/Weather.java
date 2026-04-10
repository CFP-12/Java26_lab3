import java.time.LocalDate;

public class Weather {
    private String cityName;
    private String countryName;
    private double latitude;
    private double longtitude;
    private LocalDate forecastDate;
    private WeatherIcon forecastWeather;
    private int forcastMinTempC;
    private int forcastMaxTempC;


    public Weather(String[] condition) {
        this.cityName = condition[0];
        this.countryName = condition[1];
        this.latitude = Double.parseDouble(condition[2]);
        this.longtitude = Double.parseDouble(condition[3]);
        this.forecastDate = LocalDate.parse(condition[4]);
        this.forecastWeather = WeatherIcon.fromString(condition[5]);
        this.forcastMinTempC = Integer.parseInt(condition[6]);
        this.forcastMaxTempC = Integer.parseInt(condition[7]);
    }
    

    public String getCityName() {
        return this.cityName;
    }

    public String getCountryName() {
        return this.countryName;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongtitude() {
        return this.longtitude;
    }

    public LocalDate getForecastDate() {
        return this.forecastDate;
    }

    public WeatherIcon getForecastWeather() {
        return this.forecastWeather;
    }

    public int getForcastMinTempC() {
        return this.forcastMinTempC;
    }

    public int getForcastMaxTempC() {
        return this.forcastMaxTempC;
    }


}
