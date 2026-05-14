class MinStack {
    List<Integer> stack = new ArrayList<>();
    public MinStack() {
    
    }
    
    public void push(int val) {
        stack.add(val);
    }
    
    public void pop() {

        stack.remove(stack.size()-1);
    }
    
    public int top() {
       return stack.get(stack.size()-1);
    }
    
    public int getMin() {
       int min_value = stack.get(0);
        for(int i : stack){
            if(i < min_value){
                min_value = i;
            }
        }
        return min_value;
    }
}
