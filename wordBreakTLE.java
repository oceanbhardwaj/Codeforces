class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        return workBreakCall(s,wordDict,0,0);
    }
    public boolean workBreakCall(String s,List<String> wordDict,int left,int j)
    {
         
    if(left>=s.length())
        return true;
        
        for(int i=j;i<s.length();i++)
        {
              String str=s.substring(left,i+1);
            if(isValid(str,wordDict) && workBreakCall(s,wordDict,i+1,i+1))
                return true;
            else 
                continue;
        
        }
        return false;
    
    }
        public boolean isValid(String str,List<String> wordDict)
        {
               if(wordDict.contains(str))
                   return true;
            return false;
        
        
        
        }
}