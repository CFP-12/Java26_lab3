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

    // 문자열 배열을 받아 Weather 객체를 생성하는 생성자
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
    
    // 도시 이름 반환
    public String getCityName() {
        return this.cityName;
    }

    // 국가 이름 반환
    public String getCountryName() {
        return this.countryName;
    }

    // 위도 반환
    public double getLatitude() {
        return this.latitude;
    }

    // 경도 반환
    public double getLongtitude() {
        return this.longtitude;
    }

    // 예보 날짜 반환
    public LocalDate getForecastDate() {
        return this.forecastDate;
    }

    // 예보 날씨 아이콘을 반환합니다.
    public WeatherIcon getForecastWeather() {
        return this.forecastWeather;
    }

    // 최저 기온을 반환
    public int getForcastMinTempC() {
        return this.forcastMinTempC;
    }

    // 최고 기온을 반환
    public int getForcastMaxTempC() {
        return this.forcastMaxTempC;
    }

    // Weather 객체의 문자열 표현을 반환
    @Override
    public String toString() {
        return "|" +
            " cityName='" + getCityName() + "'" +
            ", countryName='" + getCountryName() + "'" +
            ", latitude='" + getLatitude() + "'" +
            ", longtitude='" + getLongtitude() + "'" +
            ", forecastDate='" + getForecastDate() + "'" +
            ", Weather='" + getForecastWeather() + "'" +
            ", MinTempC='" + getForcastMinTempC() + "'" +
            ", MaxTempC='" + getForcastMaxTempC() + "'" +
            "|";
    }

}
