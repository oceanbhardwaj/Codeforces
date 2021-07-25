class Solution {
    public int getLucky(String s, int k) {
        String sum="";
        for(int i=0;i<s.length();i++)
        {
            int d=(s.charAt(i)-'a'+1);
            sum=sum+d;
        }
    int sum1=0;
        for(int i=0;i<sum.length();i++)
        {
           sum1=sum1+(sum.charAt(i)-'0');
        }
        k--;
        if(k==0)
            return sum1;
        while(k>0)
        {
         int res=sum1;
            int ans=0;
            while(sum1>0)
            { 
                int rem=sum1%10;
                ans=ans+rem;
                sum1=sum1/10;

            }
            k--;
            if(k==0)
                return ans;
            
            sum1=ans;
        
        
        }
        return -1;
        
        
    }
}