class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> list = new Stack<>();
        int result = 0;
        for(String value : operations){
            if(value.equals("C")){
               list.pop();
            }
            else if(value.equals("D")){
                list.add(list.peek()*2);
            }
            else if(value.equals("+")){
                int l = list.pop();
                int x = list.peek();
                list.add(l);
                list.add(l + x);
            }
            else{
                int y = Integer.parseInt(value);
                list.add(y);
            }
        }

        for(int i : list){
            result+=i;
        }
        
        return result;
    }
}