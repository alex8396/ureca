class Solution {
    public String solution(String my_string, int[][] queries) {
        // 문자열을 char 배열로 변환
        char[] str = my_string.toCharArray();

        // queries에 있는 각 쿼리를 순차적으로 처리
        for (int[] query : queries) {
            int s = query[0]; // 시작 인덱스
            int e = query[1]; // 끝 인덱스

            // 부분 문자열 뒤집기
            while (s < e) {
                char temp = str[s];
                str[s] = str[e];
                str[e] = temp;
                s++;
                e--;
            }
        }

        // char 배열을 다시 문자열로 변환
        return new String(str);
    }
}
