import java.util.Scanner;

public class App {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Weather[] weathers = WeatherParser.parse(WeatherData.WeatherDatas());
        WeatherFinder finder = new WeatherFinder(weathers);

        System.out.print("Please enter the condition(cityName, countryName, weather, continent, temperature): ");
        String input = new String(scan.nextLine());
        switch(input){
            case "cityName":
                System.out.print("Please enter the city name in english: ");
                String cityname = new String(scan.nextLine());

                System.out.println();
                System.out.println(" ------ Found Data by City ------");
                for (var weather : finder.findCityName(cityname)) {
                    System.out.println(weather);
                }
                break;
            case "countryName":
                System.out.print("Please enter the country name in english: ");
                String countryname = new String(scan.nextLine());

                System.out.println();
                System.out.println(" ------ Found Data by Country ------");
                for (var weather : finder.findCountryName(countryname)) {
                    System.out.println(weather);
                }
                break;
            case "weather":
                System.out.println("Please enter weather in english");
                System.out.println("(SUNNY, SNOW, FAIR, CLOUDY, SUNNY_INTERVALS, PARTLY_CLOUDY, RAIN, THUNDERSTORMS, FINE, FOG, CLEAR, COOL, SHOWERS, SUNNY_PERIODS,ISOLATED_SHOWERS, MOSTLY_CLOUDY, DUST)");
                System.out.print(": ");
                WeatherIcon weathericon = WeatherIcon.fromString(scan.nextLine());

                System.out.println();
                System.out.println(" ------ Found Data by Weather ------");
                for (var weather : finder.findIconWeathers(weathericon)) {
                    System.out.println(weather);
                }
                break;
            case "continent":
                System.out.print("Please enter the continent name in english: ");
                String continent = new String(scan.nextLine());

                System.out.println();
                System.out.println(" ------ Found Data by Continent ------");
                for (var weather : finder.findContinent(continent)) {
                    System.out.println(weather);
                }
                break;
            case "temperature":
                System.out.print("Please enter which temperature you want to search(under 0, over 0): ");
                String temperature = new String(scan.nextLine());

                System.out.println();
                System.out.println(" ------ Found Data by Temperature ------");
                for (var weather : finder.findTemperature(temperature)) {
                    System.out.println(weather);
                }
                break;
            default:
                break;
        }
    }
}
