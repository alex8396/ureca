class Solution {
    public int[] solution(String[] strlist) {
        // strlist 배열의 크기만큼 결과 배열을 선언
        int[] answer = new int[strlist.length];
        
        // 각 문자열의 길이를 answer 배열에 저장
        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        
        return answer;
    }
}
