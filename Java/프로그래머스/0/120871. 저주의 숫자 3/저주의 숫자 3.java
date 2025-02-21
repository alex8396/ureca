class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        
        // 3x 마을에서 쓰는 숫자를 계산
        for (int i = 1; ; i++) {
            if (i % 3 != 0 && !String.valueOf(i).contains("3")) {
                count++;
                if (count == n) {
                    answer = i;
                    break;
                }
            }
        }
        
        return answer;
    }
}
