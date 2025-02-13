class Solution {
    public int[] solution(int[] arr) {
        
        int[] result = new int[0];
        
        
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];  
            
            
            for (int j = 0; j < num; j++) {
                
                int[] newResult = new int[result.length + 1];
                
                
                for (int k = 0; k < result.length; k++) {
                    newResult[k] = result[k];
                }
                
                
                newResult[result.length] = num;
                
                result = newResult;
            }
        }
        
        return result;
    }
}
