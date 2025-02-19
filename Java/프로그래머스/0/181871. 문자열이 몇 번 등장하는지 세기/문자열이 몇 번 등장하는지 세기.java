class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int index = 0;
        
        // pat이 myString에서 나타날 때마다 카운트
        while ((index = myString.indexOf(pat, index)) != -1) {
            answer++;  // pat을 찾으면 카운트 증가
            index += 1;  // 다음 검색을 위해 한 칸 뒤로 이동
        }
        
        return answer;
    }
}
