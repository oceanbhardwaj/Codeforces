class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res=new ArrayList<>();
        HashMap<String,Integer> h=new HashMap<>();
        for(int i=0;i<=s.length()-10;i++)
        {
            String str=s.substring(i,i+10);
            h.put(str,h.getOrDefault(str,0)+1);
        }
        for(String ss:h.keySet())
        {
          if(h.get(ss)>1)
              res.add(ss);
        }
        return res;
    }
}