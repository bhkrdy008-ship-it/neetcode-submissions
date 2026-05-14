class Solution {
    public String mergeAlternately(String word1, String word2) {
        String val = "";

        int i = 0; int j = 0;

        while(i < word1.length() || j <word2.length()){
           
           if(i < word1.length()){
            val+=word1.charAt(i);
           }
           if(j < word2.length()){
            val+=word2.charAt(j);
           }
           i++;
           j++;
        }

        
        return val;
    }
}