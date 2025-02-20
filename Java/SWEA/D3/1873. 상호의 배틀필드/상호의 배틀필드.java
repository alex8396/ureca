import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    static char[][] graph; // 게임 맵을 저장할 배열
    static int direction, h, w, x, y; // 전차의 방향, 게임 맵의 크기, 전차의 위치

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); // 결과를 출력할 StringBuilder 객체

        // 테스트 케이스의 수 입력
        int testCase = Integer.parseInt(br.readLine());

        // 각 테스트 케이스 처리
        for (int t = 1; t <= testCase; t++) {
            // 게임 맵의 크기 입력
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            h = Integer.parseInt(st.nextToken()); // 맵의 높이
            w = Integer.parseInt(st.nextToken()); // 맵의 너비

            // 게임 맵 초기화
            graph = new char[h][w];
            
            // 게임 맵 상태 입력 및 전차의 시작 위치 찾기
            for (int r = 0; r < h; r++) {
                input = br.readLine();
                for (int c = 0; c < w; c++) {
                    graph[r][c] = input.charAt(c); // 게임 맵에 각 문자 저장
                    findStart(r, c); // 전차의 시작 위치를 찾기 위한 메소드 호출
                }
            }

            // 사용자 입력의 개수 입력
            int n = Integer.parseInt(br.readLine());
            
            // 사용자 입력에 따른 동작 수행
            input = br.readLine();
            for (int i = 0; i < n; i++) {
                runCommand(input.charAt(i)); // 각 명령에 따른 동작 실행
            }

            // 결과 출력 (테스트 케이스 번호와 맵 상태 출력)
            sb.append("#" + t + " ");
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    sb.append(graph[i][j]); // 맵의 각 칸을 출력
                }
                sb.append("\n");
            }
        }
        System.out.print(sb); // 최종 결과 출력
    }

    // 전차의 시작 위치를 찾는 메소드
    public static void findStart(int r, int c) {
        if (graph[r][c] == '^' || graph[r][c] == 'v' || graph[r][c] == '<' || graph[r][c] == '>') {
            x = r; // 전차의 x 좌표
            y = c; // 전차의 y 좌표
            switch (graph[r][c]) {
                case '^':
                    direction = 1; // 위 방향
                    break;
                case 'v':
                    direction = 2; // 아래 방향
                    break;
                case '<':
                    direction = 3; // 왼쪽 방향
                    break;
                case '>':
                    direction = 4; // 오른쪽 방향
                    break;
            }
        }
    }

    // 사용자 명령에 따른 동작을 수행하는 메소드
    public static void runCommand(char command) {
        switch (command) {
            case 'U': // 위로 전차 이동
                direction = 1; // 방향을 위로 설정
                move(); // 이동
                break;
            case 'D': // 아래로 전차 이동
                direction = 2; // 방향을 아래로 설정
                move(); // 이동
                break;
            case 'L': // 왼쪽으로 전차 이동
                direction = 3; // 방향을 왼쪽으로 설정
                move(); // 이동
                break;
            case 'R': // 오른쪽으로 전차 이동
                direction = 4; // 방향을 오른쪽으로 설정
                move(); // 이동
                break;
            case 'S': // 포탄 발사
                shoot(); // 포탄 발사
                break;
        }
    }

    // 전차 이동을 처리하는 메소드
    public static void move() {
        int newX = x; // 새로운 x 좌표
        int newY = y; // 새로운 y 좌표
        char status = 0; // 전차의 상태 (방향)

        // 방향에 따라 이동할 좌표 설정
        switch (direction) {
            case 1:
                newX--; // 위로 이동
                status = '^'; // 위 방향으로 설정
                break;
            case 2:
                newX++; // 아래로 이동
                status = 'v'; // 아래 방향으로 설정
                break;
            case 3:
                newY--; // 왼쪽으로 이동
                status = '<'; // 왼쪽 방향으로 설정
                break;
            case 4:
                newY++; // 오른쪽으로 이동
                status = '>'; // 오른쪽 방향으로 설정
                break;
        }

        // 이동 가능한지 확인 후 이동
        if (0 <= newX && newX < h && 0 <= newY && newY < w && graph[newX][newY] == '.') {
            graph[x][y] = '.'; // 이전 위치를 평지로 변경
            x = newX; // 새로운 위치로 이동
            y = newY; // 새로운 위치로 이동
        }
        graph[x][y] = status; // 새로운 위치에 전차 상태(방향) 저장
    }

    // 포탄 발사 처리하는 메소드
    public static void shoot() {
        switch (direction) {
            case 1: // 위로 발사
                for (int i = x - 1; i > -1; i--) {
                    if (graph[i][y] == '*') {
                        graph[i][y] = '.'; // 벽돌 벽 파괴
                        break;
                    }
                    if (graph[i][y] == '#') {
                        break; // 강철 벽은 파괴되지 않음
                    }
                }
                break;
            case 2: // 아래로 발사
                for (int i = x + 1; i < h; i++) {
                    if (graph[i][y] == '*') {
                        graph[i][y] = '.'; // 벽돌 벽 파괴
                        break;
                    }
                    if (graph[i][y] == '#') {
                        break; // 강철 벽은 파괴되지 않음
                    }
                }
                break;
            case 3: // 왼쪽으로 발사
                for (int i = y - 1; i > -1; i--) {
                    if (graph[x][i] == '*') {
                        graph[x][i] = '.'; // 벽돌 벽 파괴
                        break;
                    }
                    if (graph[x][i] == '#') {
                        break; // 강철 벽은 파괴되지 않음
                    }
                }
                break;
            case 4: // 오른쪽으로 발사
                for (int i = y + 1; i < w; i++) {
                    if (graph[x][i] == '*') {
                        graph[x][i] = '.'; // 벽돌 벽 파괴
                        break;
                    }
                    if (graph[x][i] == '#') {
                        break; // 강철 벽은 파괴되지 않음
                    }
                }
                break;
        }
    }
}
