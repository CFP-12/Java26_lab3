public class WeatherData {
    public static String[][] data = {
        // columns: cityName, countryName, latitude, longitude, forecastDate, forecastWeather, forecastMinTempC, forecastMaxTempC
        {"Santiago", "Chile", "-33.445", "-70.6825", "2026-01-28", "Sunny", "15", "34"},
        {"Tashkent", "Uzbekistan", "41.27", "69.27", "2026-01-28", "Snow", "0", "2"},
        {"Addis Ababa", "Ethiopia", "9.02", "38.73", "2026-01-28", "Sunny", "12", "24"},
        {"Athens", "Greece", "37.97", "23.72", "2026-01-28", "Fair", "7", "16"},
        {"Tokyo", "Japan", "35.68", "139.77", "2026-01-28", "Cloudy", "2", "9"},
        {"Stockholm", "Sweden", "59.33", "18.05", "2026-01-28", "Sunny Intervals", "-6", "-2"},
        {"Paris", "France", "48.821667", "2.337778", "2026-01-28", "Partly Cloudy", "6", "8"},
        {"Madrid", "Spain", "40.411111", "-3.678056", "2026-01-28", "Rain", "3", "11"},
        {"Rome (ROMA)", "Italy", "41.951944", "12.500833", "2026-01-28", "Thunderstorms", "8", "15"},
        {"Moscow", "Russian Federation", "55.833333", "37.616667", "2026-01-28", "Snow", "-8", "-7"},
        {"Riyadh", "Saudi Arabia", "24.72", "46.73", "2026-01-28", "Fine", "27", "39"},
        {"Abu Dhabi", "United Arab Emirates", "24.433333", "54.466667", "2026-01-28", "Fair", "14", "25"},
        {"New Delhi (SFD)", "India", "28.583333", "77.2", "2026-01-28", "Fog", "12", "18"},
        {"Seoul", "Republic of Korea", "37.57", "126.97", "2026-01-28", "Clear", "-10", "-2"},
        {"Bangkok", "Thailand", "13.706944", "100.568056", "2026-01-28", "Cool", "23", "34"},
        {"Singapore", "Singapore", "1.366667", "103.916667", "2026-01-28", "Showers", "24", "33"},
        {"Beijing", "China", "39.933333", "116.283333", "2026-01-28", "Cloudy", "-6", "1"},
        {"Nairobi", "Kenya", "-1.3", "36.75", "2026-01-28", "Sunny Intervals", "15", "28"},
        {"Ottawa, Ontario", "Canada", "45.3225", "-75.669167", "2026-01-28", "Sunny Periods", "-21", "-11"},
        {"Washington DC", "United States of America", "38.85", "-77.03", "2026-01-28", "Cloudy", "-13", "-5"},
        {"Havana", "Cuba", "23.17", "-82.35", "2026-01-28", "Isolated Showers", "13", "24"},
        {"Buenos Aires", "Argentina", "-34.58", "-58.48", "2026-01-28", "Mostly Cloudy", "24", "33"},
        {"Wellington", "New Zealand", "-41.32", "174.82", "2026-01-28", "Fine", "11", "22"},
        {"Canberra", "Australia", "-35.308889", "149.200278", "2026-01-28", "Partly Cloudy", "15", "42"},
        {"Jakarta", "Indonesia", "-6.17", "106.8", "2026-01-28", "Rain", "22", "28"},
        {"Abuja", "Nigeria", "9.066667", "7.483333", "2026-01-28", "Dust", "21", "37"},
        {"London", "United Kingdom of Great Britain and Northern Ireland", "51.504722", "-0.131111", "2026-01-28", "Cloudy", "5",
        "9"},
        {"Ankara", "Türkiye", "39.95", "32.88", "2026-01-28", "Rain", "3", "7"},
        {"Berlin", "Germany", "52.565556", "13.310833", "2026-01-28", "Cloudy", "-3", "1"},
        {"Suva", "Fiji", "-18.15", "178.45", "2026-01-28", "Showers", "22", "32"}
    };

    // Weather 객체 배열로 변환하여 반환하는 메서드
    public static String[][] WeatherDatas(){
        return data;
    }
}
