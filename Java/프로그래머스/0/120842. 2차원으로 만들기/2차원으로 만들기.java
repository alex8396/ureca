class Solution {
    public int[][] solution(int[] num_list, int n) {
        // 결과를 저장할 2차원 배열을 크기 계산하여 생성
        int[][] answer = new int[num_list.length / n][n];

        // num_list의 원소들을 n개씩 나누어 2차원 배열에 채운다
        for (int i = 0; i < num_list.length; i++) {
            answer[i / n][i % n] = num_list[i];
        }

        return answer;
    }
}
