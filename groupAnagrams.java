class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> h=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {

         String str=strs[i];
            char ch[]=str.toCharArray();
            Arrays.sort(ch);
            String s=new String(ch);
            if(h.containsKey(s))
            {
                h.get(s).add(str);
            }
            else
            {
                h.put(s,new ArrayList<>());
                h.get(s).add(str);
            }
        
        
        }
        List<List<String>> res=new ArrayList<>();
        for(String s:h.keySet())
        {
            res.add(h.get(s));
        }
        return res;
    }
}