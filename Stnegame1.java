class Solution {
    int alex=0;
    int bob=0;
    public boolean stoneGame(int[] piles) {
        int n=piles.length;
        HashMap<String,Integer> h=new HashMap<>();
        return dfs(piles,0,n-1,0, n,h)>=0? true:false;
        
        
        
    }
    public int dfs(int piles[],int i,int end,int n,int chance,HashMap<String,Integer> h)
    {
        if(i>=n || end<0)
            return 0;
        String x=i+"code"+end+"code"+chance;
        if(h.containsKey(x))
            return h.get(x);
        int s=0;
        if(chance==0) //alex
        {
        s=Math.max(piles[i]+dfs(piles,i+1,end,n,1,h),piles[end]+dfs(piles,i,end-1,n,1,h));
            
        }
        else
        {
            s=Math.min(-piles[i]+dfs(piles,i+1,end,n,0,h),-piles[end]+dfs(piles,i,end-1,n,0,h));
        }
        h.put(x,s);
        return s;
        
   
    
}
}