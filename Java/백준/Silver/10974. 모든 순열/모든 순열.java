import java.util.Scanner;

public class Main {
    static int N;
    static int[] arr;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        sc.close();

        arr = new int[N];
        visited = new boolean[N + 1];

        backtrack(0);
    }

    static void backtrack(int depth) {
        if (depth == N) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) { // 중복 방지
                visited[i] = true;
                arr[depth] = i;
                backtrack(depth + 1);
                visited[i] = false; // 백트래킹 (원상복구)
            }
        }
    }
}
