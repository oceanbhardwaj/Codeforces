class StockPrice {

    PriorityQueue<Pair> min;
    PriorityQueue<Pair> max;
    HashMap<Integer,Integer> h;
    class Pair
    {
        int t;
        int p;
        Pair(int t,int p)
        {
            this.t=t;
            this.p=p;
        }
    }
    Pair pp=null;
    public StockPrice() {
        h=new   LinkedHashMap<>();
        max=new PriorityQueue<>((o1,o2)->o2.p-o1.p);
        min=new PriorityQueue<>((o1,o2)->o1.p-o2.p);
    
    }
    
    public void update(int timestamp, int price) {
        //update curr
           
            if(pp==null || timestamp>=pp.t  )
            {
                pp=new Pair(timestamp,price);
               
            }

            h.put(timestamp,price);
           min.add(new Pair(timestamp,price));
         max.add(new Pair(timestamp,price));
          
            
          
           
       
        
          
        
    }
    
    public int current() {
        // int m=0;
        //  for(int i:h.keySet())
        //     {
        //       m=Math.max(i,m);
        //     }
            
       return pp.p;
        
    }
    
    public int maximum() {
       Pair maxi=max.peek();
        while(true)
        {
         maxi=max.peek();
            if(maxi.p!=h.get(maxi.t))
                max.poll();
            else
                break;
        }
        return maxi.p;
    }
    
    public int minimum() {
        Pair mini=min.peek();
        while(true)
        {
         mini=min.peek();
            if(mini.p!=h.get(mini.t))
                min.poll();
            else
                break;
        }
        return mini.p;
    
        
    }
}

/**
 * Your StockPrice object will be instantiated and called as such:
 * StockPrice obj = new StockPrice();
 * obj.update(timestamp,price);
 * int param_2 = obj.current();
 * int param_3 = obj.maximum();
 * int param_4 = obj.minimum();
 */