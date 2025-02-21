class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0, y = 0; // 캐릭터 초기 위치
        int xLimit = board[0] / 2; // 가로 최대 범위
        int yLimit = board[1] / 2; // 세로 최대 범위

        for (String key : keyinput) {
            switch (key) {
                case "up":
                    if (y + 1 <= yLimit) y++;
                    break;
                case "down":
                    if (y - 1 >= -yLimit) y--;
                    break;
                case "left":
                    if (x - 1 >= -xLimit) x--;
                    break;
                case "right":
                    if (x + 1 <= xLimit) x++;
                    break;
            }
        }

        return new int[]{x, y};
    }
}
