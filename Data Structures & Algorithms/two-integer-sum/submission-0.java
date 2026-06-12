class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> ans = new HashMap<>();
        int i = 0;
        int result = 0;
        for (int num: nums){
            result = target - num;
            if(!ans.containsKey(result)){
                ans.put(num, i);
                i = i+1;                
            } else{
                return new int[] {ans.get(result),i};
            }
        }
        return new int[] {0,0};
    }
}
