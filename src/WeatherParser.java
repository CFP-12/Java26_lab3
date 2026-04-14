// 날씨 데이터를 파싱하는 클래스
public class WeatherParser {
    //문자열 데이터 배열로부터 Weather 객체 배열을 생성
    public static Weather[] parse(String[][] data) {
        Weather[] weathers = new Weather[data.length];
        for(int i = 0; i < data.length; i++) {
            weathers[i] = new Weather(data[i]);
        }
        return weathers;
    }

}
