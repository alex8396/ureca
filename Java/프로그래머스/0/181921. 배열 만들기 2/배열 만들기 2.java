import java.util.*;

class Solution {
    // 0과 5로만 이루어진 숫자들을 저장할 리스트
    private void generateNumbers(int current, int l, int r, Set<Integer> resultSet) {
        // 현재 숫자가 범위 [l, r] 안에 있다면 결과 리스트에 추가
        if (current > r) {
            return;
        }
        if (current >= l) {
            resultSet.add(current);  // Set에 추가하여 중복을 자동으로 처리
        }
        
        // 0과 5만 추가하여 재귀적으로 생성
        if (current * 10 + 5 <= r) {
            generateNumbers(current * 10 + 5, l, r, resultSet);
        }
        if (current * 10 + 0 <= r && current != 0) {
            generateNumbers(current * 10 + 0, l, r, resultSet);
        }
    }
    
    public int[] solution(int l, int r) {
        Set<Integer> resultSet = new HashSet<>();
        
        // 0부터 시작하는 숫자를 재귀적으로 생성
        generateNumbers(5, l, r, resultSet); // 5부터 시작
        generateNumbers(50, l, r, resultSet); // 50부터 시작
        generateNumbers(55, l, r, resultSet); // 55부터 시작
        
        // 결과 리스트가 비어있으면 -1을 반환
        if (resultSet.isEmpty()) {
            return new int[] {-1};
        }
        
        // Set을 List로 변환 후 정렬
        List<Integer> resultList = new ArrayList<>(resultSet);
        Collections.sort(resultList);
        
        // 결과를 배열로 변환하여 반환
        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }
}
