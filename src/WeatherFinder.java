public class WeatherFinder {
    private Weather[] data;

    public WeatherFinder(Weather[] data) {
        this.data = data;
    }
    
    public Weather[] findCityName(String cityname) {
        int count = 0;
        for (var weather : data) {
            if(weather.getCityName().equalsIgnoreCase(cityname)) {
                count++;
            }
        }

        int index = 0;
        Weather[] result = new Weather[count];
        for(var weather : data) {
            if (weather.getCityName().equalsIgnoreCase(cityname)) {
                result[index++] = weather;
            }
        }

        return result;
    }

    public Weather[] findCountryName(String countryname) {
        int count = 0;
        for (var weather : data) {
            if(weather.getCountryName().equalsIgnoreCase(countryname)) {
                count++;
            }
        }

        int index = 0;
        Weather[] result = new Weather[count];
        for(var weather : data) {
            if (weather.getCountryName().equalsIgnoreCase(countryname)) {
                result[index++] = weather;
            }
        }

        return result;
    }

    public Weather[] findIconWeathers(WeatherIcon icon) {
        int count = 0;
        for (var weather : data) {
            if(weather.getForecastWeather() == icon) {
                count++;
            }
        }

        int index = 0;
        Weather[] result = new Weather[count];
        for(var weather : data) {
            if (weather.getForecastWeather() == icon) {
                result[index++] = weather;
            }
        }

        return result;
    }

    public Weather[] findContinent(String continent) {
        double minLat, maxLat, minLon, maxLon;
        if (continent == "Aisa") {
            minLat = 10; maxLat = 81; minLon = 26; maxLon = 170;
        } else if (continent == "Europe") {
            minLat = 35; maxLat = 71; minLon = -25; maxLon = 66;
        } else if (continent == "Africa") {
            minLat = -35; maxLat = 37; minLon = -168; maxLon = -52;
        } else if (continent == "North America") {
            minLat = 7; maxLat = 83; minLon = -168; maxLon = -52;
        } else if (continent == "South America") {
            minLat = -56; maxLat = 12; minLon = -81; maxLon = -35;
        } else if (continent == "Oceania") {
            minLat = -47; maxLat = -10; minLon = 113; maxLon = 153;
        } else {
            minLat = -90; maxLat = -63; minLon = -180; maxLon = 180;
        }

        int count = 0;
        for(var weather : data) {
            if(weather.getLatitude() >= minLat && weather.getLatitude() <= maxLat
                && weather.getLongtitude() >= minLon && weather.getLongtitude() <= maxLon) {
                count++;
            }
        }

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

    public Weather[] findTemperature(int temp) {
        int count = 0;
        for (var weather : data) {
            if(weather.getForcastMaxTempC() == temp) {
                count++;
            }
        }

        int index = 0;
        Weather[] result = new Weather[count];
        for(var weather : data) {
            if (weather.getForcastMaxTempC() == temp) {
                result[index++] = weather;
            }
        }

        return result;
    }
}
