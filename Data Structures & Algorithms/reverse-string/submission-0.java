class Solution {
    public void reverseString(char[] s) {
        int length = s.length;

        for(int i =0; i< length/2; i++){
             char a = s[i];
             char z = s[length - i -1];

            if(a != z){
                
                s[i] = z;
                s[length - i -1] = a;
            }
        }
    }


}