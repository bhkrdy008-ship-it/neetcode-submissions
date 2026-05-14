class Solution {
    public String longestCommonPrefix(String[] strs) {
    
    if(strs.length == 0){
        return "";
    }

    String value = strs[0];

    for(int i =0; i<strs.length; i++){
        while(strs[i].indexOf(value) != 0){
            value = value.substring(0, value.length() -1);

            if (value.isEmpty()) {
                    return "";
                }
        }
    }

    return value;

    }
}