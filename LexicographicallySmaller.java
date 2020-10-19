class Solution {
    public String findLexSmallestString(String s, int a, int b) {
        HashSet<String> h=new HashSet<>();
        
            
        call(h,s,a,b);
        ArrayList<String> a1=new ArrayList(h);
        Collections.sort(a1);
        return a1.get(0);
    }
    private  void call(HashSet<String> h,String s,int a,int b)
    {
        if(h.contains(s))
            return;
        h.add(s);
        call(h,rotate(s,b),a,b);
        char ch[]=s.toCharArray();
        for(int i=1;i<=s.length();i+=2)
        {
            int val = ch[i]-48;
            val = (val+a)%10;
            ch[i] = (char)(val+48);
        }
        call(h,new String(ch),a,b);
        
        
        
        
        
        
    }
   
    
    
    private String rotate(String s,int min)
    {
        
        return s.substring(s.length()-min)+s.substring(0,s.length()-min);
    }
   
}