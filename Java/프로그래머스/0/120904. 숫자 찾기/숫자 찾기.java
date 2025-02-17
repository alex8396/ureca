class Solution {
    public int solution(int num, int k) {
        // num을 문자열로 변환
        String numStr = Integer.toString(num);
        // k를 문자열로 변환
        String kStr = Integer.toString(k);
        
        // 문자열에서 k의 위치를 찾기 (인덱스는 0부터 시작하므로 1을 더해야 실제 자리가 맞음)
        int index = numStr.indexOf(kStr);
        
        // k가 없으면 -1을 반환
        if (index == -1) {
            return -1;
        } else {
            // 1-based index로 반환
            return index + 1;
        }
    }
}
