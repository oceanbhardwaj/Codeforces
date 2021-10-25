class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashMap<String,Boolean> h=new HashMap<>();
        return workBreakCall(s,wordDict,0,h);
    }
    public boolean workBreakCall(String s,List<String> wordDict,int left,HashMap<String,Boolean> h)
    {
         
    if(wordDict.contains(s))
        return true;
       if(h.containsKey(s))
            return h.get(s);
        for(int i=0;i<s.length();i++)
        {
              String str=s.substring(0,i+1);
             
            if(wordDict.contains(str) &&                                  workBreakCall(s.substring(i+1),wordDict,i+1,h))
            {
                h.put(s,true);
                return true;
                
            }
            else {
               
                continue;
                
            }
        
        }
         h.put(s,false);
        return false;
    
    }
       
}