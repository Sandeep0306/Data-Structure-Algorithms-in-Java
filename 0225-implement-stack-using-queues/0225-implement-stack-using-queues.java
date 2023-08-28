class MyStack {
 Queue<Integer> mainQ;
 Queue<Integer> helpQ;

    public MyStack() {
        mainQ = new ArrayDeque<>();
         helpQ = new ArrayDeque<>();

    }
    
    public void push(int x) {
        mainQ.add(x);
    }
    
    public int pop() {
           while(mainQ.size()>1){
               helpQ.add(mainQ.remove());
           }
           int val = mainQ.remove();


           while(helpQ.size()>0){
               mainQ.add(helpQ.remove());
           }

           return val;

    }
    
    public int top() {
           while(mainQ.size()>1){
               helpQ.add(mainQ.remove());
           }
           int val = mainQ.remove();

           helpQ.add(val);

           while(helpQ.size()>0){
               mainQ.add(helpQ.remove());
           }

           return val;
    }
    
    public boolean empty() {
        if(mainQ.size()==0){
            return true;
        }else{
            return false;
        }
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */