class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        
        int[] answer;
        
        if (n == 1) {
            // num_list[0]부터 slicer[1]번 인덱스까지 자르기
            answer = new int[b + 1];
            for (int i = 0; i <= b; i++) {
                answer[i] = num_list[i];
            }
        } else if (n == 2) {
            // slicer[0]번 인덱스부터 num_list 끝까지 자르기
            int len = num_list.length - a;
            answer = new int[len];
            for (int i = 0; i < len; i++) {
                answer[i] = num_list[a + i];
            }
        } else if (n == 3) {
            // slicer[0]번 인덱스부터 slicer[1]번 인덱스까지 자르기
            int len = b - a + 1;
            answer = new int[len];
            for (int i = 0; i < len; i++) {
                answer[i] = num_list[a + i];
            }
        } else {
            // slicer[0]번 인덱스부터 slicer[1]번 인덱스까지 slicer[2] 간격으로 자르기
            int len = (b - a) / c + 1;
            answer = new int[len];
            for (int i = 0; i < len; i++) {
                answer[i] = num_list[a + i * c];
            }
        }
        
        return answer;
    }
}
