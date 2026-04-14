import java.util.Scanner;

public class App {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        // 날씨 데이터를 파싱하여 Weather 객체 배열 생성
        Weather[] weathers = WeatherParser.parse(WeatherData.WeatherDatas());
        // WeatherFinder 객체 생성
        WeatherFinder finder = new WeatherFinder(weathers);

        // 사용자에게 검색 조건 입력 요청
        System.out.print("Please enter the condition(cityName, countryName, weather, continent, temperature): ");
        String input = new String(scan.nextLine());
        // 입력에 따라 검색 수행
        switch(input){
            case "cityName":
                // 도시 이름으로 검색
                System.out.print("Please enter the city name in english: ");
                String cityname = new String(scan.nextLine());

                Weather[] cityWeathers = finder.findCityName(cityname);

                System.out.println();
                System.out.println(" ------ Found Data by City ------");
                for (var weather : cityWeathers) {
                    System.out.println(weather);
                }

                System.out.println();
                WeatherGraph.printGraph(cityWeathers);
                break;
            case "countryName":
                // 국가 이름으로 검색
                System.out.print("Please enter the country name in english: ");
                String countryname = new String(scan.nextLine());

                Weather[] countryWeathers = finder.findCountryName(countryname);

                System.out.println();
                System.out.println(" ------ Found Data by Country ------");
                for (var weather : countryWeathers) {
                    System.out.println(weather);
                }

                System.out.println();
                WeatherGraph.printGraph(countryWeathers);
                break;
            case "weather":
                // 날씨 아이콘으로 검색
                System.out.println("Please enter weather in english");
                System.out.println("(SUNNY, SNOW, FAIR, CLOUDY, SUNNY_INTERVALS, PARTLY_CLOUDY, RAIN, THUNDERSTORMS, FINE, FOG, CLEAR, COOL, SHOWERS, SUNNY_PERIODS,ISOLATED_SHOWERS, MOSTLY_CLOUDY, DUST)");
                System.out.print(": ");
                WeatherIcon weathericon = WeatherIcon.fromString(scan.nextLine());

                Weather[] iconWeathers = finder.findIconWeathers(weathericon);

                System.out.println();
                System.out.println(" ------ Found Data by Weather ------");
                for (var weather : iconWeathers) {
                    System.out.println(weather);
                }

                System.out.println();
                WeatherGraph.printGraph(iconWeathers);
                break;
            case "continent":
                // 대륙으로 검색
                System.out.print("Please enter the continent name in english: ");
                String continent = new String(scan.nextLine());

                Weather[] continentWeathers = finder.findContinent(continent);

                System.out.println();
                System.out.println(" ------ Found Data by Continent ------");
                for (var weather : continentWeathers) {
                    System.out.println(weather);
                }

                System.out.println();
                WeatherGraph.printGraph(continentWeathers);
                break;
            case "temperature":
                // 온도로 검색
                System.out.print("Please enter which temperature you want to search(under 0, over 0): ");
                String temperature = new String(scan.nextLine());

                Weather[] temperatureWeathers = finder.findTemperature(temperature);

                System.out.println();
                System.out.println(" ------ Found Data by Temperature ------");
                for (var weather : temperatureWeathers) {
                    System.out.println(weather);
                }

                System.out.println();
                WeatherGraph.printGraph(temperatureWeathers);
                break;
            default:
                // 유효하지 않은 입력
                break;
        }
    }
}
