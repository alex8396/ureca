import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        // 결과를 담을 ArrayList 생성
        ArrayList<Integer> result = new ArrayList<>();
        
        // intStrs 배열을 순회하면서 처리
        for (String str : intStrs) {
            // s부터 시작하여 l 길이의 부분 문자열을 추출하고 정수로 변환
            int num = Integer.parseInt(str.substring(s, s + l));
            
            // 정수가 k보다 크면 결과에 추가
            if (num > k) {
                result.add(num);
            }
        }
        
        // ArrayList를 int 배열로 변환
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}
