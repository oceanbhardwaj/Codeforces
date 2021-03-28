class Solution {
    public int numDifferentIntegers(String word) {
       int count=0;
         HashSet<String> h=new HashSet<>();
        int n=word.length();
        
        for(int i=0;i<word.length();i++)
        {  String s="";
            while(i<n && Character.isDigit(word.charAt(i)))
            {
                s=s+word.charAt(i);
                i++;
            }
       
         if(!s.isEmpty())
         { int j=0;
          String f=s;
          int n1=s.length();
             while(j<n1 && s.charAt(j)=='0' && f.length()>1)
                   {
                       j++;
                   } 
         h.add(s.substring(j));
         }
        }
        return h.size();
        
    }
}