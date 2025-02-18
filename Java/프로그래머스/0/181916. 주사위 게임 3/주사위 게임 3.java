import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] num = {a, b, c, d};
        
        // 주사위의 같은 숫자의 갯수를 담을 Map
        Map<Integer, Integer> dictNum = new HashMap<>();
        
        // 주사위의 숫자를 map에 넣기
        for (int n : num) {
            dictNum.put(n, dictNum.getOrDefault(n, 0) + 1);
        }
        
        // 값을 기준으로 오름차순으로 정렬
        List<Map.Entry<Integer, Integer>> sortedList = new ArrayList<>(dictNum.entrySet());
        sortedList.sort(Map.Entry.comparingByValue());
        
        // 주사위가 모두 같은 수인 경우
        if (dictNum.size() == 1) {
            return 1111 * sortedList.get(0).getKey();
        }
        
        // [1, 3] 혹은 [2, 2]로 나뉘었을 경우
        if (dictNum.size() == 2) {
            if (sortedList.get(0).getValue() == 1) {
                int p = sortedList.get(1).getKey();
                int q = sortedList.get(0).getKey();
                return (10 * p + q) * (10 * p + q);
            } else {
                int p = sortedList.get(0).getKey();
                int q = sortedList.get(1).getKey();
                return (p + q) * Math.abs(p - q);
            }
        }
        
        // [1, 1, 2]인 경우 (두 개가 같은 숫자와 두 개의 다른 숫자)
        if (dictNum.size() == 3) {
            int p = sortedList.get(2).getKey();  // 두 개가 같은 숫자
            int q = sortedList.get(1).getKey();  // 다른 숫자
            return q * sortedList.get(0).getKey();  // 두 다른 숫자 곱하기
        }
        
        // 네 개의 숫자가 모두 다를 때
        return Math.min(num[0], Math.min(num[1], Math.min(num[2], num[3])));
    }
}
