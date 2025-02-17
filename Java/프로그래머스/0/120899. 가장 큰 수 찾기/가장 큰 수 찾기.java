class Solution {
    public int[] solution(int[] array) {
        // 가장 큰 수와 그 수의 인덱스를 찾기
        int max = array[0];
        int index = 0;
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        
        // 결과 배열에 [가장 큰 수, 인덱스] 저장
        return new int[] {max, index};
    }
}
