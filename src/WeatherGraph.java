public class WeatherGraph {
    // 입력받은 데이터를 그래프로 출력하는 메서드
    public static void printGraph(Weather[] data) {
        if(data.length == 0) {
            System.out.println("No data to display.");
            return;
        }

        System.out.println();
        System.out.println("==================================================");
        System.out.println("             최저/최고 기온 막대 차트             ");
        System.out.println("==================================================");
        
        int zeroOffset = 30; // 0도를 기준으로 그래프 위치 설정
        for (var weather : data) {
            int minTemp = weather.getForcastMinTempC();
            int maxTemp = weather.getForcastMaxTempC();

            // 최저 기온 그래프
            // 도시 이름을 먼저 출력하고, 0도를 기준으로 그래프를 그리는 좌측 여백을 만듬
            System.out.printf("%-20s | ", weather.getCityName());
            // 0도 기준선 왼쪽 영역: 음수 온도가 있을 때는 ■로 표시
            for (int i = -zeroOffset; i < 0; i++) {
                if (i < minTemp) {
                    System.out.print(" ");
                } else {
                    System.out.print("■");
                }
            }
            // 0도 위치 표시
            System.out.print("|");
            // 0도 기준선 오른쪽 영역: 양수 온도면 ■ 개수를 추가로 출력
            for (int i = 0; i < Math.max(0, minTemp); i++) {
                System.out.print("■");
            }
            System.out.printf(" %d°C (Min)\n", minTemp);

            // 최고 기온 그래프
            // 라벨을 비워서 같은 기준선을 아래에 동일하게 정렬
            System.out.printf("%-20s | ", "");
            // 0도 기준선 왼쪽 영역: 최고 기온이 음수인 경우에 ■를 표시
            for (int i = -zeroOffset; i < 0; i++) {
                if (i < maxTemp) {
                    System.out.print(" ");
                } else {
                    System.out.print("■");
                }
            }
            // 0도 위치 표시
            System.out.print("|");
            // 0도 기준선 오른쪽 영역: 양수 최고 기온을 시각화
            for (int i = 0; i < Math.max(0, maxTemp); i++) {
                System.out.print("■");
            }
            System.out.printf(" %d°C (Max)\n", maxTemp);

            System.out.println("--------------------------------------------------------------");
        }
    }
}
