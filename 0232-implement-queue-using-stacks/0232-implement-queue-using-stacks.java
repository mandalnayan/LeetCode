class MyQueue {
  Stack<Integer> st1;
  Stack<Integer> st2;
    public MyQueue() {
      st1 = new Stack<>();
      st2 = new Stack<>();
    }
    
    public void push(int x) {
        st1.add(x);
    }
    
    public int pop() {
        if (st2.empty()) {
          while(!st1.empty()) {
            st2.add(st1.pop());
          }
        }
          return st2.pop();
        
    }
    
    public int peek() {
        if (st2.empty()) {
          while(!st1.empty()) {
            st2.add(st1.pop());
          }
        }
          return st2.peek();
        
    }
    
    public boolean empty() {
         return (st1.empty() && st2.empty());
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