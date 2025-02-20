class Solution {
    public String[] solution(String my_str, int n) {
        // 배열의 크기 계산: my_str 길이를 n으로 나누고, 나머지가 있으면 1개 더 추가
        int length = my_str.length();
        int size = (length + n - 1) / n;  // 이 부분은 (length / n)과 동일하되, 나머지가 있을 경우 1을 더함
        
        // 결과 배열 선언
        String[] answer = new String[size];
        
        // my_str을 n씩 잘라서 배열에 저장
        for (int i = 0; i < size; i++) {
            int start = i * n; // 자를 시작 인덱스
            int end = Math.min(start + n, length); // 자를 끝 인덱스, 끝은 my_str의 길이를 넘지 않도록 처리
            answer[i] = my_str.substring(start, end);
        }
        
        return answer;
    }
}
