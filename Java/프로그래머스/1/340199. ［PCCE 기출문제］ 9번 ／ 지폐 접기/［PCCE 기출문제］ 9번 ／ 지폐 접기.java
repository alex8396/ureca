class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int w_min = Math.min(wallet[0], wallet[1]);
        int w_max = Math.max(wallet[0], wallet[1]);
        int b_min = Math.min(bill[0], bill[1]);
        int b_max = Math.max(bill[0], bill[1]);

        while(true){
            // 지폐가 지갑에 들어가지 않으면 접기
            if(w_min < b_min || w_max < b_max){
                b_max /= 2;  // 긴 쪽을 반으로 접음
                answer++;
            }
            
            // 가로와 세로의 크기 순서를 맞추기 위해 비교 후 교환
            if(b_max < b_min){
                int temp = b_max;
                b_max = b_min;
                b_min = temp;
            }

            // 지폐가 지갑에 들어가면 종료
            if(b_max <= w_max && b_min <= w_min){
                break;
            }
        }

        return answer;
    }
}
