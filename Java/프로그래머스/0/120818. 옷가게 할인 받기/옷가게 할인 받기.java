class Solution {
    public int solution(int price) {
        if (price >= 500000) {
            return (int)(price * 0.8); // 20% 할인
        } else if (price >= 300000) {
            return (int)(price * 0.9); // 10% 할인
        } else if (price >= 100000) {
            return (int)(price * 0.95); // 5% 할인
        } else {
            return price; // 할인 없음
        }
    }
}
