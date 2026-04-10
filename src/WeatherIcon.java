
public enum WeatherIcon {
    SUNNY, SNOW, FAIR, CLOUDY, SUNNY_INTERVALS, PARTLY_CLOUDY, RAIN, THUNDERSTORMS, FINE, FOG, CLEAR, COOL, SHOWERS, SUNNY_PERIODS,
    ISOLATED_SHOWERS, MOSTLY_CLOUDY, DUST;

    public static WeatherIcon fromString(String icon) {
        String format = icon.toUpperCase().replace(" ", "_");
        return WeatherIcon.valueOf(format);
    }
}
