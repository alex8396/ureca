class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder answer = new StringBuilder(); // 문자열을 이어 붙일 StringBuilder

        // parts 배열을 순회하면서 각 문자열에서 부분 문자열을 추출하여 이어 붙임
        for (int i = 0; i < my_strings.length; i++) {
            // my_strings[i]에서 parts[i]에 해당하는 부분 문자열 추출
            String part = my_strings[i].substring(parts[i][0], parts[i][1] + 1);
            answer.append(part); // 해당 부분 문자열을 이어 붙임
        }

        return answer.toString(); // 최종적으로 이어 붙인 문자열 반환
    }
}
