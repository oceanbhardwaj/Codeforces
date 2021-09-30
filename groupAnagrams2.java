class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> h=new HashMap<>();
        for(String s:strs)
        {
            int count[]=new int[26];
            for(char ch:s.toCharArray())
            {
                count[ch-'a']++;
            }
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<26;i++)
            {
                sb.append("#");
                sb.append(count[i]);
            }
            String ss=sb.toString();
            h.putIfAbsent(ss,new ArrayList<>());
            h.get(ss).add(s);
        }
        List<List<String>> res=new ArrayList<>();
        for(String s:h.keySet())
        {
            res.add(h.get(s));
        }
        return res;
    }
}