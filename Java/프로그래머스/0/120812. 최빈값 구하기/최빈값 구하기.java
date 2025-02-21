import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
        // 숫자의 빈도를 저장할 HashMap
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // 배열의 각 원소를 순회하면서 빈도 기록
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // 최빈값을 찾기 위한 변수
        int maxFrequency = 0;
        int mostFrequentNumber = -1;
        int count = 0; // 최빈값의 갯수를 세기 위한 변수
        
        // HashMap에서 최빈값 찾기
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int number = entry.getKey();
            int frequency = entry.getValue();
            
            // 더 높은 빈도를 찾으면 갱신
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mostFrequentNumber = number;
                count = 1; // 최빈값이 하나로 정해졌으므로 카운트를 1로 설정
            }
            // 빈도가 같으면 count를 증가시켜서 최빈값이 여러 개인지 확인
            else if (frequency == maxFrequency) {
                count++;
            }
        }
        
        // 최빈값이 여러 개일 경우 -1을 반환
        if (count > 1) {
            return -1;
        }
        
        // 최빈값을 반환
        return mostFrequentNumber;
    }
}
