class Solution {
    public int solution(int[] numbers, int k) {
        int index = 0; // 첫 번째 던지는 사람은 0번째 인덱스
        for (int i = 1; i < k; i++) {  // k번째까지 던지기 위해서 k-1번 이동
            index = (index + 2) % numbers.length; // 한 명을 건너뛰고 던진다
        }
        return numbers[index];  // k번째 던지는 사람의 번호 반환
    }
}
