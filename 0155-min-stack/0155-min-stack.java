class MinStack {
    Stack<Integer> s,min;

    public MinStack() {
        s = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int value) {
        s.push(value);
        if(min.isEmpty() || value<=min.peek())   min.push(value);
    }
    
    public void pop() {
        if(s.peek().equals(min.peek()))  min.pop();
        s.pop();
    }
    
    public int top() {
        if(s.isEmpty()) return -1;
    return s.peek();
    }
    
    public int getMin() {
        if(min.isEmpty()) return -1;
    return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */