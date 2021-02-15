class Solution {
    public int countHomogenous(String s) {
        HashMap<Character,Integer> h=new HashMap<>();
        long ans=0;
        char ch='0';
        int mod=(int)1000000007;
            int res=0;
        int count=0;
        
            for(int i=0;i<s.length();i++)
            {
             if(s.charAt(i)==ch)
            count++;
                else
                    count=1;
                ch=s.charAt(i);
                
                res=(res+count)%mod;
            }
            
      return res;
        
    }
}
//a-1
aa-3-->n(n+1)/2
    aaa-6-->n(n+1)/2;
