class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            h.put(s.charAt(i),i); //storing last index
        }
        int max=0;
        String res="";
      List<Integer> a=new ArrayList<>();
        int start=0;
        int last=0;
          String str="";
       
       
        for(int i=0;i<s.length();i++)
        {
            
            char ch=s.charAt(i);
            if(h.get(ch)<last)
                continue;
            else
            {last=h.get(ch);
              str=s.substring(start,last+1);
            }
            if(i>=last)
            {
                a.add(str.length());
                res="";
                start=i+1;
                last=-1;
               
                
            }
            
           
        
            
        }
        return a; 
    }
}