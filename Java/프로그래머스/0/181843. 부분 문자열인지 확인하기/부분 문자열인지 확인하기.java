class Solution {
    public int solution(String my_string, String target) {
        // my_string이 target을 포함하는지 확인
        if (my_string.contains(target)) {
            return 1;
        } else {
            return 0;
        }
    }
}
