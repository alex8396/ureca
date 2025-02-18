class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder answer = new StringBuilder();  // 결과를 저장할 StringBuilder 사용

        for (int index : index_list) {
            answer.append(my_string.charAt(index));  // index에 해당하는 문자 추가
        }

        return answer.toString();  // StringBuilder를 String으로 반환
    }
}
