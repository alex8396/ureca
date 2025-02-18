import java.util.Scanner;

public class Main {
    static int N, M;
    static int[] arr;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        sc.close();

        arr = new int[M]; // 선택된 수열 저장
        visited = new boolean[N + 1]; // 방문 여부 체크

        backtrack(0);
    }

    static void backtrack(int depth) {
        if (depth == M) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) { // 중복 방지
                visited[i] = true; // 방문 체크
                arr[depth] = i; // 숫자 선택
                backtrack(depth + 1); // 다음 깊이 탐색
                visited[i] = false; // 백트래킹 (원상복구)
            }
        }
    }
}
