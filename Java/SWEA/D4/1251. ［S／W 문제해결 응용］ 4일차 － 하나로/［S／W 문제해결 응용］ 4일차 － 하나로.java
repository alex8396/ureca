import java.util.*;

class Solution
{
    static int N;
    static double E;
    static double[] x, y; // x, y 좌표
    static int[] parents; // 유니온-파인드용 부모 배열
    static double ans; // 결과

    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 수

        // 여러 개의 테스트 케이스 처리
        for (int test_case = 1; test_case <= T; test_case++)
        {
            N = sc.nextInt(); // 섬의 개수
            x = new double[N]; // x 좌표
            y = new double[N]; // y 좌표
            parents = new int[N]; // 유니온-파인드 부모 배열 초기화
            ans = 0; // 결과 초기화

            // x, y 좌표 입력 받기
            for (int i = 0; i < N; i++)
            {
                x[i] = sc.nextDouble();
            }
            for (int i = 0; i < N; i++)
            {
                y[i] = sc.nextDouble();
            }
            
            E = sc.nextDouble(); // 환경 부담 세율 E

            // 간선 리스트 생성 (두 섬 사이의 거리 계산)
            List<Edge> list = new ArrayList<>();
            for (int i = 0; i < N - 1; i++)
            {
                for (int j = i + 1; j < N; j++)
                {
                    double dist = E * (Math.pow(x[i] - x[j], 2) + Math.pow(y[i] - y[j], 2));
                    list.add(new Edge(i, j, dist));
                }
            }

            // 간선 리스트를 weight 기준으로 정렬
            Collections.sort(list);

            // 유니온-파인드 부모 배열 초기화
            for (int i = 0; i < N; i++)
            {
                parents[i] = i;
            }

            // 크루스칼 알고리즘: 최소 비용 간선부터 선택
            for (Edge edge : list)
            {
                if (union(edge.from, edge.to)) // 두 섬을 연결할 수 있으면
                {
                    ans += edge.weight; // 비용에 추가
                }
            }

            // 결과 출력 (반올림)
            System.out.println("#" + test_case + " " + Math.round(ans));
        }
    }

    // 유니온-파인드에서 부모를 찾는 함수
    static int find(int a)
    {
        if (parents[a] == a)
            return a;
        return parents[a] = find(parents[a]); // 경로 압축
    }

    // 유니온-파인드에서 두 집합을 합치는 함수
    static boolean union(int a, int b)
    {
        int aRoot = find(a);
        int bRoot = find(b);
        if (aRoot != bRoot)
        {
            parents[bRoot] = aRoot; // bRoot를 aRoot에 연결
            return true;
        }
        return false;
    }

    // 간선 클래스 (Edge)
    static class Edge implements Comparable<Edge>
    {
        int from, to; // 두 섬
        double weight; // 비용 (환경 부담금)

        public Edge(int from, int to, double weight)
        {
            this.from = from;
            this.to = to;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge o)
        {
            // 비용을 기준으로 오름차순 정렬
            return Double.compare(this.weight, o.weight);
        }
    }
}
