import java.util.ArrayList;  // ArrayList를 사용하기 위한 import

class Solution {
    public int[] solution(int n) {
        // ArrayList를 사용하여 수열을 저장
        ArrayList<Integer> sequence = new ArrayList<>();
        
        // 수열 시작값을 추가
        sequence.add(n);
        
        // n이 1이 될 때까지 반복
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;  // 짝수일 때
            } else {
                n = 3 * n + 1;  // 홀수일 때
            }
            sequence.add(n);
        }
        
        // ArrayList를 int[] 배열로 변환
        int[] answer = new int[sequence.size()];
        for (int i = 0; i < sequence.size(); i++) {
            answer[i] = sequence.get(i);
        }
        
        return answer;
    }
}
