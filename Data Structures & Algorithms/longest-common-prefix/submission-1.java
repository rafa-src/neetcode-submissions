class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0){
            return "";
        }

        String molde = strs[0];

        for(int i=0;i < molde.length() ;i++){
            char caracterActual = molde.charAt(i);
            for(int j = 1; j < strs.length ; j++){
                String palabraActual = strs[j];

                if(i == palabraActual.length() || palabraActual.charAt(i) != caracterActual ){
                   return molde.substring(0,i); 
                }
            }
        }
    return molde;
    }
}