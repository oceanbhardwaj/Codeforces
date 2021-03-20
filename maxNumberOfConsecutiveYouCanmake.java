class Solution {
    public int getMaximumConsecutive(int[] coins) {
        int n=coins.length;
        TreeMap<Integer,Integer> h=new TreeMap<>();
        Arrays.sort(coins);
        for(int i=0;i<n;i++)
        {
            h.put(coins[i],h.getOrDefault(coins[i],0)+1);
            
        }
        int x=0;
        int index=0;
        for(int i:h.keySet())
        {
            x=i*h.get(i);
            if(index+1>=i)
                index+=x;
            
        }
        return index+1;
        
        
    }
}