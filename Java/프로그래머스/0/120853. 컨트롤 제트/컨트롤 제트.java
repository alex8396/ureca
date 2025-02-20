class Solution {
    public int solution(String s) {
        int answer = 0;  // 최종 결과를 저장할 변수
        int lastNum = 0; // 마지막으로 더한 숫자를 저장할 변수
        
        // 문자열을 공백을 기준으로 분리
        String[] elements = s.split(" ");
        
        // 배열을 순차적으로 처리
        for (String element : elements) {
            if (element.equals("Z")) {
                // "Z"가 나오면 마지막으로 더한 숫자를 빼기
                answer -= lastNum;
            } else {
                // 숫자일 경우 더하기
                lastNum = Integer.parseInt(element);
                answer += lastNum;
            }
        }

        return answer;
    }
}
