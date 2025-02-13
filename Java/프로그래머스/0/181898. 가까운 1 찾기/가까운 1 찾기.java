class Solution {
    public int solution(int[] arr, int idx) {
        // idx부터 시작하여 1이 있는지 확인
        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) {
                return i;  // 1이 처음 등장하는 인덱스를 반환
            }
        }
        return -1;  // 1이 없으면 -1을 반환
    }
}
