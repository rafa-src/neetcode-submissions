class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numeros = new HashSet<>();
        

        for (int num: nums){
            boolean repetido = (numeros.add(num) == false) ? true : false;
            
            if (repetido == true){
            return true;
            }
        } 
        return false;
    }
}