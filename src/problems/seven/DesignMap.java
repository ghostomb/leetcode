package problems.seven;

public class DesignMap {
}

class MyHashMap {

    int size=1000000;
    Node[] nodes;

    class Node {
        private  final int key;
        private int value;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    int hash(int index){
        return index %size;
    }
    /** Initialize your data structure here. */
    public MyHashMap() {
        nodes=new Node[size];
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        Node node=new Node(key, value);
        int index=hash(key);
        if(nodes[index]==null){
            nodes[index]=node;
        }else {
            nodes[index].value =value;
        }
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        if(nodes[hash(key)]!=null){
            return nodes[hash(key)].value;
        }else{
            return -1;
        }
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        if(nodes[hash(key)]!=null){
            nodes[hash(key)]=null;
        }else {
            return;
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