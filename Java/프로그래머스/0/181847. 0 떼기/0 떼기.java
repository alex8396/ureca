class Solution {
    public String solution(String n_str) {
        // n_str에서 처음으로 등장하는 0들을 제거
        String answer = n_str.replaceFirst("^0+", "");
        return answer;
    }
}
