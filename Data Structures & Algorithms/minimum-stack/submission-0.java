class MinStack {
    List<Integer> list;

    public MinStack() {
        list = new ArrayList<>();
    }
    
    public void push(int val) {
        list.add(val);
    }
    
    public void pop() {
    list.remove(list.size()-1);
    }
    
    public int top() {
      int topValue =list.get(list.size()-1);
    return topValue;
    }

    
    public int getMin() {
        int minValue = Collections.min(list);
    return minValue;
    }
}
