import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> divisors = new ArrayList<>();
        
        for (int i = 1; i * i <= n; i++) { // 제곱근까지만 반복 (최적화)
            if (n % i == 0) {
                divisors.add(i); // 작은 약수 추가
                if (i != n / i) { // 중복 방지
                    divisors.add(n / i); // 큰 약수 추가
                }
            }
        }
        
        Collections.sort(divisors); // 오름차순 정렬
        return divisors.stream().mapToInt(Integer::intValue).toArray(); // 리스트를 배열로 변환
    }
}
