class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        // k를 문자열로 변환하여 각 숫자에서 등장 여부를 확인
        String target = Integer.toString(k);
        
        // i부터 j까지의 숫자에서 k가 등장하는 횟수를 셈
        for (int num = i; num <= j; num++) {
            // 현재 숫자를 문자열로 변환하여 k의 등장 횟수를 셈
            String numStr = Integer.toString(num);
            for (int index = 0; index < numStr.length(); index++) {
                if (numStr.charAt(index) == target.charAt(0)) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}
