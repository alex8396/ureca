import java.util.Scanner;

public class Main {
    static int N, M;
    static int[] selected;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        selected = new int[M];

        backtrack(1, 0);
        sc.close();
    }

    static void backtrack(int start, int depth) {
        if (depth == M) {
            for (int num : selected) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i <= N; i++) {
            selected[depth] = i;  // 숫자 선택
            backtrack(i + 1, depth + 1);  // 다음 숫자를 선택
        }
    }
}
