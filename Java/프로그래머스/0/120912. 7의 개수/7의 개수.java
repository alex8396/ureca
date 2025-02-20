class Solution {
    public int solution(int[] array) {
        int answer = 0; // '7'의 개수를 저장할 변수

        // 배열의 각 원소를 순차적으로 확인
        for (int num : array) {
            // 숫자를 문자열로 변환하고, 그 문자열에서 '7'의 개수를 셈
            String str = Integer.toString(num);
            for (char ch : str.toCharArray()) {
                if (ch == '7') {
                    answer++; // '7'을 찾으면 개수 증가
                }
            }
        }

        return answer; // 총 '7'의 개수 반환
    }
}
