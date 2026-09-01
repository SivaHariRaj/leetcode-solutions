class MinStack {
    Deque<Integer> stack = new ArrayDeque<>();
    Deque<Integer> min = new ArrayDeque<>();
    public MinStack() {
    }
    
    public void push(int value) {
        stack.push(value);
        if(min.isEmpty() || min.peek() >=value)
        {
            min.push(value);
        }
    }
    
    public void pop() {
       int v= stack.pop();
        if(v==min.peek())
        {
            min.pop();
        }
    }
    
    public int top() {
        return  stack.peek();
    }
    
    public int getMin() {
        return  min.peek();
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