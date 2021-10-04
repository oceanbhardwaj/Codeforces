class MinStack {

    Stack<Integer> s;
    
    public MinStack() {
        s=new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
    }
    
    public void pop() {
        s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        Stack<Integer> s1=new Stack<>();
        int min=Integer.MAX_VALUE;
        while(!s.isEmpty())
        {
            min=Math.min(s.peek(),min);
            s1.push(s.pop());
        }
        while(!s1.isEmpty())
            s.push(s1.pop());
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
////////////////////////////////////////////////
class MinStack {

    Stack<Integer> s;
    Stack<Integer> min;
    public MinStack() {
        s=new Stack<>();
        min=new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
        if(min.isEmpty() || min.peek()>=val)
            min.push(val);
    }
    
    public void pop() {
        int value=s.pop();
        if(min.peek()==value)
            min.pop();
        
    }
    
    public int top() {
        return s.peek();
        
    }
    
    public int getMin() {
        return  min.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */