class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;  // 기본값은 -1로 설정
        
        // 공원의 크기
        int rows = park.length;
        int cols = park[0].length;
        
        // 가능한 돗자리 크기 내림차순으로 확인
        for (int mat : mats) {
            // mat 크기의 정사각형이 공원에 들어갈 수 있는지 확인
            for (int i = 0; i <= rows - mat; i++) {
                for (int j = 0; j <= cols - mat; j++) {
                    boolean canPlace = true;
                    
                    // mat 크기의 정사각형을 (i, j)부터 시작하여 확인
                    for (int x = i; x < i + mat; x++) {
                        for (int y = j; y < j + mat; y++) {
                            if (!park[x][y].equals("-1")) {  // 사람이 앉아있는 곳이면 불가능
                                canPlace = false;
                                break;
                            }
                        }
                        if (!canPlace) break;
                    }
                    
                    // 돗자리가 들어갈 수 있으면 answer 갱신
                    if (canPlace) {
                        answer = Math.max(answer, mat);
                    }
                }
            }
        }
        
        return answer;
    }
}
