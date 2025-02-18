class Solution {
    public int solution(int n, String control) {
        // control의 각 문자에 대해 연산을 수행
        for (char c : control.toCharArray()) {
            if (c == 'w') {
                n += 1;
            } else if (c == 's') {
                n -= 1;
            } else if (c == 'd') {
                n += 10;
            } else if (c == 'a') {
                n -= 10;
            }
        }
        return n;
    }
}
