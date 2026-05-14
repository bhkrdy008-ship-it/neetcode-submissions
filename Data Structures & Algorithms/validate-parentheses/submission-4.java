class Solution {
    public boolean isValid(String s) {

        HashMap<Character, Character> map = new HashMap<>();
        map.put('}','{');
        map.put(')','(');
        map.put(']','[');

        Stack<Character> stack = new Stack<>();

        for(char i : s.toCharArray()){
            if(map.containsKey(i)){
                if(stack.isEmpty() || map.get(i) != stack.pop()){
                
                    return false;
                }
            }
            else{
                stack.push(i);
            }
        }

      return stack.isEmpty();
        
    }
}
