import java.util.*;

public class Main {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    
    public static void dfs(int v) {
        visited[v] = true;
        System.out.print(v + " ");
        for (int i : graph[v]) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }
    
    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[graph.length];
        queue.add(start);
        visited[start] = true;
        
        while (!queue.isEmpty()) {
            int v = queue.poll();
            System.out.print(v + " ");
            for (int i : graph[v]) {
                if (!visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int v = sc.nextInt();
        
        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a].add(b);
            graph[b].add(a);
        }
        
        for (int i = 1; i <= n; i++) {
            Collections.sort(graph[i]);
        }
        
        visited = new boolean[n + 1];
        dfs(v);
        System.out.println();
        
        bfs(v);
    }
}
