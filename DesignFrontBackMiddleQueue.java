class FrontMiddleBackQueue {
    ArrayList<Integer>a;
    Queue<Integer>q;
    

    public FrontMiddleBackQueue() {
        a=new ArrayList<Integer>();
        q=new LinkedList<Integer>();
        
    }
    
    public void pushFront(int val) {
        a.add(0,val);
        q=new LinkedList<Integer>();
        for(int i:a)
        {
            q.add(i);
        }
        
    }
    
    public void pushMiddle(int val) {
        if(a.size()==0)
        {
            a.add(val);
            q.add(val);
        }
        else{
        int n=a.size();
        int index=0;
      // if(n%2==0)
            index=n/2;
        //else
           // index=n/2+1;
        q=new LinkedList<Integer>();
        a.add(index,val);
        for(int i:a)
            q.add(i);}
        
    }
    
    public void pushBack(int val) {
        a.add(val);
      q.add(val);
        
        
    }
    
    public int popFront() {
        if(a.size()>0)
        { int d=a.get(0);
        a.remove(0);
        q=new LinkedList<Integer>();
        for(int i:a)
            q.add(i);
        return d;}
         return -1;
        
    }
    
    public int popMiddle() {
         int n=a.size();
        if(n==1)
        {
            int d2=a.remove(0);
            q.poll();
            return d2;
        }
        if(n>0){
        int index=0;
        if(n%2==0)
            index=n/2;
        else
            index=n/2+1;
        q=new LinkedList<Integer>();
            if(a.size()<index)
                return -1;
        int d1=a.get(index-1);
            
        a.remove(index-1);
        for(int i:a)
            q.add(i);
        return d1;}
        return -1;
        
    }
    
    public int popBack() {
       
       int n=a.size();
        if(n>0){
        int e=a.get(n-1);
        a.remove(n-1);
        q=new LinkedList<Integer>();
        for(int i:a)
            q.add(i);
        return e;}
        return -1;
        
    }
}

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */