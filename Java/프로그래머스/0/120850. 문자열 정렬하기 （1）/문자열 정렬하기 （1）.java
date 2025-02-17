import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        // 숫자를 담을 리스트 생성
        List<Integer> numbers = new ArrayList<>();
        
        // 문자열을 순회하며 숫자만 추출
        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                numbers.add(c - '0');  // 숫자로 변환하여 리스트에 추가
            }
        }
        
        // 리스트를 오름차순으로 정렬
        Collections.sort(numbers);
        
        // 리스트를 배열로 변환하여 반환
        return numbers.stream().mapToInt(i -> i).toArray();
    }
}
