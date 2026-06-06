class Node{
    int key;
    int value;

    public Node(int key, int value){
        this.key = key;
        this.value = value;
    }
}

class LRUCache {
    List<Node> nodes;
    int size = 0;
    int i;
    public LRUCache(int capacity) {
        nodes = new ArrayList<>();
        size = capacity;
    }
    
    public int get(int key) {
        for(int k = 0; k< nodes.size(); k++){
            if(nodes.get(k).key == key){
               Node temp = nodes.remove(k); // remove from current position
                nodes.add(temp);             // move to most recently used
                return temp.value;
            }
        }

        return -1;
    }
    
    public void put(int key, int value) {
                for (int k = 0; k < nodes.size(); k++) {
            if (nodes.get(k).key == key) {
                nodes.remove(k);
                nodes.add(new Node(key, value)); // update and move to end
                return;
            }
        }
        Node newNode = new Node(key, value);
       if(nodes.size() < size ){
        nodes.add(newNode);
       }
       else{
        nodes.remove(0);
        nodes.add(newNode);
       }
    }
}
