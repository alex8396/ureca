import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        // delete_list의 원소를 빠르게 찾기 위해 Set으로 변환
        Set<Integer> deleteSet = new HashSet<>();
        for (int num : delete_list) {
            deleteSet.add(num);
        }
        
        // 결과를 담을 ArrayList
        List<Integer> resultList = new ArrayList<>();
        
        // arr 배열을 순회하면서 deleteSet에 없는 원소만 resultList에 추가
        for (int num : arr) {
            if (!deleteSet.contains(num)) {
                resultList.add(num);
            }
        }
        
        // resultList를 int 배열로 변환하여 반환
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        
        return result;
    }
}
