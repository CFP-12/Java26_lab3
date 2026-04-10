# Weather Search Application

이 프로젝트는 Java를 사용하여 날씨 데이터를 검색하는 콘솔 기반 애플리케이션입니다. 사용자가 도시 이름, 국가 이름, 날씨 상태, 대륙, 온도 조건 등으로 날씨 정보를 필터링하여 조회할 수 있습니다.

## 기술 스택

- **언어**: Java 25 (JDK 25)
- **프레임워크/라이브러리**: 표준 Java 라이브러리 (java.util.Scanner, java.time.LocalDate 등)
- **빌드 도구**: javac (Java 컴파일러)
- **IDE**: Visual Studio Code (권장)
- **기타**: Git (버전 관리)

## 프로젝트 구조

```
src/
├── App.java              # 메인 애플리케이션 클래스 (사용자 입력 처리)
├── Weather.java          # 날씨 데이터 모델 클래스
├── WeatherData.java      # 날씨 데이터 저장 클래스
├── WeatherParser.java    # 데이터 파싱 클래스
├── WeatherFinder.java    # 검색 로직 클래스
└── WeatherIcon.java      # 날씨 아이콘 enum 클래스

bin/                      # 컴파일된 클래스 파일들
lib/                      # 의존성 라이브러리 (현재 없음)
```

## 설치 및 실행 방법

### 사전 요구사항

- **Java JDK 25** 설치 (Oracle JDK 또는 OpenJDK)
  - 다운로드: [Oracle JDK 25](https://www.oracle.com/java/technologies/javase/jdk25-archive-downloads.html) 또는 [OpenJDK](https://openjdk.org/)
- **Visual Studio Code** 설치 (권장)
  - Java Extension Pack 설치 (Microsoft 제공)

### VS Code에서 실행

1. VS Code에서 프로젝트 폴더를 엽니다.
2. Java Extension Pack이 설치되어 있는지 확인합니다.
3. `src/App.java`를 열고 F5 키를 눌러 디버그 모드로 실행합니다.

## 사용 방법

프로그램을 실행하면 콘솔에 검색 조건을 입력하라는 메시지가 표시됩니다.

### 검색 조건 옵션

1. **cityName**: 도시 이름으로 검색
   - 입력 예: `cityName`
   - 도시 이름 입력: `Tokyo`

2. **countryName**: 국가 이름으로 검색
   - 입력 예: `countryName`
   - 국가 이름 입력: `Japan`

3. **weather**: 날씨 상태로 검색
   - 입력 예: `weather`
   - 날씨 상태 입력: `SUNNY` (가능한 값: SUNNY, SNOW, FAIR, CLOUDY, SUNNY_INTERVALS, PARTLY_CLOUDY, RAIN, THUNDERSTORMS, FINE, FOG, CLEAR, COOL, SHOWERS, SUNNY_PERIODS, ISOLATED_SHOWERS, MOSTLY_CLOUDY, DUST)

4. **continent**: 대륙으로 검색
   - 입력 예: `continent`
   - 대륙 이름 입력: `Asia` (가능한 값: Asia, Europe, Africa, North America, South America, Oceania)

5. **temperature**: 온도로 검색
   - 입력 예: `temperature`
   - 조건 입력: `under 0` (0도 이하) 또는 `over 0` (0도 이상)

### 사용 예시

```
Please enter the condition(cityName, countryName, weather, continent, temperature): cityName
Please enter the city name in english: Tokyo

 ------ Found Data by City ------
| cityName='Tokyo', countryName='Japan', latitude='35.68', longtitude='139.77', forecastDate='2026-01-28', Weather='CLOUDY', MinTempC='2', MaxTempC='9' |
```

## 데이터 설명

- 날씨 데이터는 `WeatherData.java`에 하드코딩되어 있습니다.
- 각 레코드는 도시 이름, 국가 이름, 위도, 경도, 예측 날짜, 날씨 상태, 최저/최고 온도를 포함합니다.
- 데이터는 2026년 1월 28일 기준의 샘플 데이터입니다.

## 기능 설명

- **WeatherFinder 클래스**: 다양한 검색 조건에 따라 데이터를 필터링합니다.
- **WeatherIcon enum**: 날씨 상태를 표준화된 enum으로 관리합니다.
- **WeatherParser**: 문자열 배열 데이터를 Weather 객체로 변환합니다.
- **App 클래스**: 사용자 인터페이스를 처리하고 검색 결과를 출력합니다.

## 문제 해결

### 컴파일 오류
- JDK 25가 올바르게 설치되었는지 확인하세요.
- `--enable-preview` 플래그가 필요합니다.

### 실행 오류
- `bin` 폴더에 컴파일된 파일이 있는지 확인하세요.
- classpath가 올바르게 설정되었는지 확인하세요.

### 데이터 검색이 안 되는 경우
- 입력 값의 철자가 정확한지 확인하세요 (대소문자 구분 없음).
- 지원되는 값 목록을 확인하세요.

## 라이선스

이 프로젝트는 MIT 라이선스를 따릅니다. 자세한 내용은 LICENSE 파일을 참조하세요.

## 연락처

프로젝트 유지보수자: 조혜준 (32234387)
