class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52]; // 대소문자 알파벳의 개수

        // 주어진 문자열을 순회하면서 각 문자에 해당하는 인덱스를 찾아 카운트 증가
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);

            // 대문자 'A'에서 'Z'는 0~25 인덱스에 대응
            if (ch >= 'A' && ch <= 'Z') {
                answer[ch - 'A']++;
            }
            // 소문자 'a'에서 'z'는 26~51 인덱스에 대응
            else if (ch >= 'a' && ch <= 'z') {
                answer[ch - 'a' + 26]++;
            }
        }
        return answer;
    }
}
