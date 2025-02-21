import java.util.*;

public class Main {  // 클래스 이름을 Main으로 변경
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 수빈이 위치
        int K = sc.nextInt(); // 동생 위치

        System.out.println(bfs(N, K)); // BFS 실행
    }

    public static int bfs(int start, int target) {
        if (start == target) return 0; // 이미 같은 위치라면 0초

        boolean[] visited = new boolean[100001]; // 방문 여부 확인
        Queue<int[]> q = new LinkedList<>(); // [현재 위치, 시간]
        
        q.offer(new int[] {start, 0});
        visited[start] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int curPos = cur[0];
            int curTime = cur[1];

            // 세 가지 이동 방식 처리
            int[] nextPositions = {curPos - 1, curPos + 1, curPos * 2};

            for (int nextPos : nextPositions) {
                // 범위 내에 있고, 방문하지 않은 위치만 이동
                if (nextPos >= 0 && nextPos <= 100000 && !visited[nextPos]) {
                    if (nextPos == target) return curTime + 1; // 동생을 찾으면 종료
                    visited[nextPos] = true;
                    q.offer(new int[] {nextPos, curTime + 1});
                }
            }
        }
        return -1; // 도달 불가능한 경우 (이 문제에서는 발생하지 않음)
    }
}
