// 날씨 데이터를 파싱하는 클래스
public class WeatherFinder {
    private Weather[] data;

    public WeatherFinder(Weather[] data) {
        this.data = data;
    }
    
    // 도시 이름으로 날씨 데이터를 검색
    public Weather[] findCityName(String cityname) {
        // 일치하는 항목 수 계산
        int count = 0;
        for (var weather : data) {
            if(weather.getCityName().equalsIgnoreCase(cityname)) {
                count++;
            }
        }

        // 결과 배열 생성 및 채우기
        int index = 0;
        Weather[] result = new Weather[count];
        for(var weather : data) {
            if (weather.getCityName().equalsIgnoreCase(cityname)) {
                result[index++] = weather;
            }
        }

        return result;
    }

    // 국가 이름으로 날씨 데이터를 검색
    public Weather[] findCountryName(String countryname) {
        // 일치하는 항목 수 계산
        int count = 0;
        for (var weather : data) {
            if(weather.getCountryName().equalsIgnoreCase(countryname)) {
                count++;
            }
        }

        // 결과 배열 생성 및 채우기
        int index = 0;
        Weather[] result = new Weather[count];
        for(var weather : data) {
            if (weather.getCountryName().equalsIgnoreCase(countryname)) {
                result[index++] = weather;
            }
        }

        return result;
    }

    // 날씨 아이콘으로 날씨 데이터를 검색
    public Weather[] findIconWeathers(WeatherIcon icon) {
        // 일치하는 항목 수 계산
        int count = 0;
        for (var weather : data) {
            if(weather.getForecastWeather() == icon) {
                count++;
            }
        }

        // 결과 배열 생성 및 채우기
        int index = 0;
        Weather[] result = new Weather[count];
        for(var weather : data) {
            if (weather.getForecastWeather() == icon) {
                result[index++] = weather;
            }
        }

        return result;
    }

    // 대륙으로 날씨 데이터를 검색
    public Weather[] findContinent(String continent) {
        // 대륙별 좌표 범위 설정
        double minLat, maxLat, minLon, maxLon;
        if (continent.equalsIgnoreCase("Asia")) {
            minLat = 10; maxLat = 81; minLon = 26; maxLon = 170;
        } else if (continent.equalsIgnoreCase("Europe")) {
            minLat = 35; maxLat = 71; minLon = -25; maxLon = 66;
        } else if (continent.equalsIgnoreCase("Africa")) {
            minLat = -35; maxLat = 37; minLon = -17; maxLon = 51;
        } else if (continent.equalsIgnoreCase("North America")) {
            minLat = 7; maxLat = 83; minLon = -168; maxLon = -52;
        } else if (continent.equalsIgnoreCase("South America")) {
            minLat = -56; maxLat = 12; minLon = -81; maxLon = -35;
        } else if (continent.equalsIgnoreCase("Oceania")) {
            minLat = -47; maxLat = -10; minLon = 113; maxLon = 153;
        } else {
            // Antarctica
            minLat = -90; maxLat = -63; minLon = -180; maxLon = 180;
        }

        // 범위 내 항목 수 계산
        int count = 0;
        for(var weather : data) {
            if(weather.getLatitude() >= minLat && weather.getLatitude() <= maxLat
                && weather.getLongtitude() >= minLon && weather.getLongtitude() <= maxLon) {
                count++;
            }
        }

        // 결과 배열 생성 및 채우기
        int index = 0;
        Weather[] result = new Weather[count];
        for(var weather : data) {
            if(weather.getLatitude() >= minLat && weather.getLatitude() <= maxLat
                && weather.getLongtitude() >= minLon && weather.getLongtitude() <= maxLon) {
                result[index++] = weather;
            }
        }

        return result;
    }

    // 온도 조건으로 날씨 데이터를 검색
    public Weather[] findTemperature(String condition) {
        if (condition.equals("under 0")) {
            // 최고 기온이 0도 이하인 항목 수 계산
            int count = 0;
            for (var weather : data) {
                if(weather.getForcastMaxTempC() <= 0) {
                    count++;
                }
            }
            
            // 결과 배열 생성 및 채우기
            int index = 0;
            Weather[] result = new Weather[count];
            for(var weather : data) {
                if (weather.getForcastMaxTempC() <= 0) {
                    result[index++] = weather;
                }
            }
            
            return result;
        } else if (condition.equals("over 0")) {
            // 최고 기온이 0도 이상인 항목 수 계산
            int count = 0;
            for (var weather : data) {
                if(weather.getForcastMaxTempC() >= 0) {
                    count++;
                }
            }
            
            // 결과 배열 생성 및 채우기
            int index = 0;
            Weather[] result = new Weather[count];
            for(var weather : data) {
                if (weather.getForcastMaxTempC() >= 0) {
                    result[index++] = weather;
                }
            }

            return result;
        } else {
            // 유효하지 않은 조건
            return new Weather[0];
        }
    }
}
