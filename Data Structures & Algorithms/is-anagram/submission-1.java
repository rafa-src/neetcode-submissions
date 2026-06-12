class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> first = new HashMap<>();
        HashMap<Character, Integer> second = new HashMap<>();

        for (char c: s.toCharArray()){
            first.merge(c, 1, Integer::sum);
        }  

        for(char c: t.toCharArray()){
            second.merge(c, 1, Integer::sum);
        }

        if (first.equals(second)){
            return true;
        }else {
            return false;
        }
    }
}
