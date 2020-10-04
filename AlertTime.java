class Solution {
    public List<String> alertNames(String[] keyName, String[] keyTime) {
        HashMap<String,List<Integer>> h=new HashMap<>();
         ArrayList<String> a=new ArrayList<>();
        if(keyName.length==0)
            return a;
       
        for(int i=0;i<keyTime.length;i++)
        {
            String k=keyName[i];
            h.computeIfAbsent(k,g->new ArrayList());
            h.get(k).add(getTime(keyTime[i]));
        }
        
       for(String s1:h.keySet())
       {
           List<Integer> l=h.get(s1);
           Collections.sort(l);
           for(int i=2;i<l.size();i++)
           {
               if(l.get(i)-l.get(i-2)<=60)
               { a.add(s1);
                break;}
           }
       }
        
        Collections.sort(a);
        return a;
        
        
        
        
            
        
    }
    private int getTime(String s)
    {
        String ss[]=s.split(":");
        return Integer.parseInt(ss[1])+60*Integer.parseInt(ss[0]);
    }
}