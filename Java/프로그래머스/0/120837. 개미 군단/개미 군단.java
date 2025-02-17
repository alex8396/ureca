class Solution {
    public int solution(int hp) {
        int general = hp / 5;  // 장군개미의 수
        int remainder = hp % 5; // 남은 체력
        
        int soldier = remainder / 3; // 병정개미의 수
        remainder %= 3; // 남은 체력
        
        int worker = remainder; // 일개미의 수 (1의 공격력으로 남은 체력만큼 필요)
        
        return general + soldier + worker;
    }
}
