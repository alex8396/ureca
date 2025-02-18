/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
// 아래 표준 입출력 예제 필요시 참고하세요.
// 표준 입력 예제
// int a;
// double b;
// char g;
// String var;
// long AB;
// a = sc.nextInt();                           // int 변수 1개 입력받는 예제
// b = sc.nextDouble();                        // double 변수 1개 입력받는 예제
// g = sc.nextByte();                          // char 변수 1개 입력받는 예제
// var = sc.next();                            // 문자열 1개 입력받는 예제
// AB = sc.nextLong();                         // long 변수 1개 입력받는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
// 표준 출력 예제
// int a = 0;                            
// double b = 1.0;               
// char g = 'b';
// String var = "ABCDEFG";
// long AB = 12345678901234567L;
//System.out.println(a);                       // int 변수 1개 출력하는 예제
//System.out.println(b); 		       						 // double 변수 1개 출력하는 예제
//System.out.println(g);		       						 // char 변수 1개 출력하는 예제
//System.out.println(var);		       				   // 문자열 1개 출력하는 예제
//System.out.println(AB);		       				     // long 변수 1개 출력하는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
	static int N, L;
    static int[] tastes, cals;
    static boolean[] isSelected;  // 이 배열을 각 테스트 케이스마다 초기화해야 함
    static int result;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스 수
        for (int tc = 1; tc <= T; tc++) {
            N = sc.nextInt(); // 재료의 수
            L = sc.nextInt(); // 제한 칼로리

            tastes = new int[N]; // 맛 점수 배열
            cals = new int[N];   // 칼로리 배열

            // 맛 점수와 칼로리 입력
            for (int i = 0; i < N; i++) {
                tastes[i] = sc.nextInt();
                cals[i] = sc.nextInt();
            }

            // isSelected 배열을 테스트 케이스마다 초기화
            isSelected = new boolean[N];

            result = 0;
            subset(0);

            // 결과를 StringBuilder에 추가
            sb.append("#").append(tc).append(" ").append(result).append("\n");
        }
        System.out.println(sb);
    }

    // 부분집합을 구하며 칼로리와 맛 점수를 합산
    private static void subset(int cnt) {
        // 모든 재료에 대해 선택/불선택을 다 해봤다면
        if (cnt == N) {
            int tastesSum = 0, calsSum = 0;

            // 선택된 재료에 대해 맛과 칼로리 합산
            for (int i = 0; i < N; i++) {
                if (isSelected[i]) {
                    tastesSum += tastes[i];
                    calsSum += cals[i];
                    if (calsSum > L) {
                        return;  // 칼로리가 제한을 넘으면 더 이상 진행할 필요 없음
                    }
                }
            }

            // 제한 칼로리 이하에서 최대 맛 점수 갱신
            result = Math.max(tastesSum, result);
            return;
        }

        // 현재 재료를 선택하는 경우
        isSelected[cnt] = true;
        subset(cnt + 1);

        // 현재 재료를 선택하지 않는 경우
        isSelected[cnt] = false;
        subset(cnt + 1);
    }
}