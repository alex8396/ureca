import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        // 표준 입력을 통해 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // 테스트 케이스 수 입력
        int T = sc.nextInt();

        // 여러 테스트 케이스 처리
        for (int test_case = 1; test_case <= T; test_case++) {
            // N(배열 크기)과 M(파리채 크기) 입력
            int N = sc.nextInt();
            int M = sc.nextInt();

            // N x N 배열 입력
            int[][] array = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    array[i][j] = sc.nextInt();
                }
            }

            // 최대 파리 수를 저장할 변수
            int maxFlies = 0;

            // M x M 파리채로 슬라이딩 윈도우 탐색
            for (int i = 0; i <= N - M; i++) {
                for (int j = 0; j <= N - M; j++) {
                    int currentFlies = 0;

                    // M x M 영역 내 파리 수 합산
                    for (int x = 0; x < M; x++) {
                        for (int y = 0; y < M; y++) {
                            currentFlies += array[i + x][j + y];
                        }
                    }

                    // 최대값 갱신
                    maxFlies = Math.max(maxFlies, currentFlies);
                }
            }

            // 결과 출력 형식에 맞춰 출력
            System.out.println("#" + test_case + " " + maxFlies);
        }

        // Scanner 자원 해제
        sc.close();
    }
}
