class Solution {
    public void reverseString(char[] s) {
        int length = s.length;

        for(int i=0;i<length/2;i++){
            char a = s[i];
            char b = s[length- 1 -i];

            if(a != b){
                s[i] = b;
                s[length-1-i] = a;
            }
        }
    }


}