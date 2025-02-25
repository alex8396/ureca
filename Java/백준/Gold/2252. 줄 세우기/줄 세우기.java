import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        List<Integer>[] graph = new ArrayList[n + 1];
        int[] inDegree = new int[n + 1];
        
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            inDegree[b]++;
        }
        
        topologicalSort(n, graph, inDegree);
    }

    private static void topologicalSort(int n, List<Integer>[] graph, int[] inDegree) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        List<Integer> result = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            if (inDegree[i] == 0) {
                pq.offer(i);
            }
        }
        
        while (!pq.isEmpty()) {
            int current = pq.poll();
            result.add(current);
            
            for (int neighbor : graph[current]) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) {
                    pq.offer(neighbor);
                }
            }
        }
        
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
