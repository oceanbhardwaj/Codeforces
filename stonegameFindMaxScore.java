class Solution {
    int alex=0;
    int bob=0;
    public boolean stoneGame(int[] piles) {
        int n=piles.length;
        HashMap<String,Integer> h=new HashMap<>();
        return dfs(piles,0,n-1, n,h)>0? true:false;
        
        
        
    }
    public int dfs(int piles[],int i,int end,int n,HashMap<String,Integer> h)
    {
        if(i>=n || end<0)
            return 0;
        String x=i+"code"+end;
        if(h.containsKey(x))
            return h.get(x);
        int s=0;
        s=Math.max((piles[i]+Math.min(dfs(piles,i+2,end,n,h),dfs(piles,i+1,end-1,n,h))),(piles[end]+Math.min(dfs(piles,i+1,end-1,n,h),dfs(piles,i,end-2,n,h))));
        h.put(x,s);
        return s;
   
    
}
}