class Solution {
    public int calPoints(String[] operations) {
        List<Integer> values = new ArrayList<>();
        int result = 0;
        for(int i =0; i<operations.length; i++){
            if(operations[i].equals("C")){
                values.remove(values.size()-1);
            }
            else if(operations[i].equals("D")){
                values.add(values.get(values.size()-1)*2);
            }
            else if(operations[i].equals("+")){
                int sum = values.get(values.size()-1) + values.get(values.size()-2);
                
                values.add(sum);
            }
            else{
                values.add(Integer.parseInt(operations[i]));
            }
        }

         for(int i : values){
                    result += i;
                }
        
        return result;
    }
}