import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> factors = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>(); // 이미 본 소인수를 체크
        
        // 2부터 시작하여 n을 나누어보면서 소인수 찾기
        for (int i = 2; i <= Math.sqrt(n); i++) {
            // i로 나누어 떨어지면 소인수로 추가
            while (n % i == 0) {
                if (!seen.contains(i)) { // 아직 추가되지 않은 소인수만 추가
                    factors.add(i);
                    seen.add(i);  // 해당 소인수를 이미 본 것으로 표시
                }
                n /= i;  // 그 숫자로 계속 나누기
            }
        }
        
        // 만약 n이 1보다 크면, n 자체가 소수이므로 factors에 추가
        if (n > 1 && !seen.contains(n)) {
            factors.add(n);
        }
        
        // ArrayList를 배열로 변환하여 리턴
        int[] answer = new int[factors.size()];
        for (int i = 0; i < factors.size(); i++) {
            answer[i] = factors.get(i);
        }
        
        return answer;
    }
}
