class MyQueue {
    
    Stack<Integer> push;
    Stack<Integer> pop;

    public MyQueue() {
        push = new Stack<>();
        pop = new Stack<>();
    }
    
    public void push(int x) {
        push.push(x);
    }
    
    public int pop() {
        
        if (!pop.empty()) return pop.pop();
        while(!push.empty()) {
            pop.push(push.pop());
        }
        return pop.pop();
    }
    
    public int peek() {
        
        if (!pop.empty()) return pop.peek();
        while(!push.empty()) {
            pop.push(push.pop());
        }
        return pop.peek();
        
    }
    
    public boolean empty() {
        return pop.empty() && push.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */