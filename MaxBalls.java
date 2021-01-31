class Solution {
    public int countBalls(int l, int h) {
        int n=h-l+1;
        int max=0;
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int i=l;i<=h;i++)
        {
            int sum=call(i);
            h1.put(sum,h1.getOrDefault(sum,0)+1);
            max=Math.max(max,h1.get(sum));
        }
        return max;
       

    }
    public int call(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum=sum+n%10;
            n=n/10;
        }
        
        
    }
}