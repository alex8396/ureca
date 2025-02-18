class Solution {
    public String solution(String[] str_list, String ex) {
        StringBuilder answer = new StringBuilder(); // 문자열을 이어붙이기 위해 StringBuilder 사용
        
        for (String str : str_list) {
            if (!str.contains(ex)) {  // str에 ex가 포함되지 않으면
                answer.append(str);   // str을 answer에 이어붙임
            }
        }
        
        return answer.toString();  // 결과 문자열 반환
    }
}
