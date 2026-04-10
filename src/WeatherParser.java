public class WeatherParser {
    public static Weather[] parse(String[][] data) {
        Weather[] weathers = new Weather[data.length];
        for(int i = 0; i < data.length; i++) {
            weathers[i] = new Weather(data[i]);
        }
        return weathers;
    }

}
