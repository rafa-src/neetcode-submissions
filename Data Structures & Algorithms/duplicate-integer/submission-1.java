class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numeros = new HashSet<>();
        for (int num: nums){
            if(!numeros.add(num)){
                return true;
            }
        } 
        return false;
    }
}