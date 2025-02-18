import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<Integer> candidates = new ArrayList<>();
        
        // 등수 순으로 학생의 인덱스를 저장
        int n = rank.length;
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        
        // 등수를 기준으로 정렬
        Arrays.sort(indices, (i, j) -> rank[i] - rank[j]);
        
        // 참여 가능한 상위 3명 찾기
        for (int i = 0; i < n; i++) {
            if (attendance[indices[i]]) {
                candidates.add(indices[i]);
                if (candidates.size() == 3) break;
            }
        }

        // 결과 계산
        int a = candidates.get(0);
        int b = candidates.get(1);
        int c = candidates.get(2);
        
        return 10000 * a + 100 * b + c;
    }
}
