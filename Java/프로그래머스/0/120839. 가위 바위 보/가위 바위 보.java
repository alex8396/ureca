class Solution {
    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder(); // 문자열을 효율적으로 다루기 위해 사용

        for (char c : rsp.toCharArray()) { // 문자열을 문자 배열로 변환 후 순회
            if (c == '2') answer.append('0'); // 가위 → 바위
            else if (c == '0') answer.append('5'); // 바위 → 보
            else if (c == '5') answer.append('2'); // 보 → 가위
        }

        return answer.toString();
    }
}
