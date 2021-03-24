class Solution {
    HashMap<String,List<String>> h=new HashMap<>();
    public List<String> wordBreak(String s, List<String> wordDict) {
        if(h.containsKey(s))
            return h.get(s);
        List<String> res=new ArrayList<>();
        if(wordDict.contains(s))
            res.add(s);
        for(int i=0;i<s.length();i++)
        {
            String left=s.substring(0,i+1);
            if(wordDict.contains(left))
            {
                 List<String> a=wordBreak(s.substring(i+1),wordDict);
                for(String s1:a)
                {
                    res.add(left+" "+s1);
                }
            }
        }
        h.put(s,res);
        return res;
    }
}