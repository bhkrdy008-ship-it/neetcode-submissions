class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> arr = new Stack<>();
        
        
        for(String s : tokens){
            if(s.equals("+")){
               arr.push(arr.pop() + arr.pop());
            }
            else if(s.equals("-")){
               int a = arr.pop();
               int b = arr.pop();
               arr.push(b - a);
            }
            else if(s.equals("/")){
                 int j = arr.pop();
               int k = arr.pop();
               arr.push(k / j);
            }
            else if(s.equals("*")){
                arr.push(arr.pop() * arr.pop());
            }
            else{
                arr.add(Integer.parseInt(s));
            }
        }
        return arr.pop();
    }
}
