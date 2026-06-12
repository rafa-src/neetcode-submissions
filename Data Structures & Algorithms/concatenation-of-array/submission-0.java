class Solution {
    public int[] getConcatenation(int[] nums) {
        int lengthx2 = nums.length*2;
        int ans[] = new int[lengthx2]; 

        for (int i=0; i < nums.length;i++){
            ans[i] = nums[i];
            ans[nums.length+i] = nums[i];
        }
        return ans;
    }
}