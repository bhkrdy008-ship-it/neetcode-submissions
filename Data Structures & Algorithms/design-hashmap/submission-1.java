class MyHashMap {
     List<int[]> map;
    public MyHashMap() {
      map = new ArrayList<>();
    }
    
    public void put(int key, int value) {
        boolean v = false;
        for(int[] x : map){
            if(x[0] == key){
                x[1] = value;
               v = true;
            }
        }
        if(!v){
        int[] x = new int[2];
        x[0] = key;
        x[1] = value;
        map.add(x);
        }

    }
    
    public int get(int key) {
        for(int[] x : map){
            if(x[0] == key){
                return x[1];
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        int k = 0;
        for(int[] x : map){
            if(x[0] == key){
                map.remove(k);
                break;
            }
            k++;
        }
        
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */