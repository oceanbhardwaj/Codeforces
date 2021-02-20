class Solution {
    public String longestNiceSubstring(String s) {
        
        String res="";
        for(int i=0;i<s.length();i++)
        {
            boolean lower[]=new boolean[26];
        boolean upper[]=new boolean[26];
        
        for(int j=i;j<s.length();j++)
        {
            if(s.charAt(j)<'a')//upper
            {
                upper[s.charAt(j)-'A']=true;
            }
            else
                lower[s.charAt(j)-'a']=true;
            if(Arrays.equals(lower,upper) && j-i>=res.length())
            {
                res=s.substring(i,j+1);
            }
        }
        }
        return res;
    }
}