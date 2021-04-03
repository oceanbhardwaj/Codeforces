class Solution {
    public boolean areSentencesSimilar(String s1, String s2)
    {
        String ch1[]=s1.split(" ");
        String ch2[]=s2.split(" ");
         int n1=ch1.length;
        int n2=ch2.length;
        if(n1>n2)
            return dfs(s2,s1);
        return dfs(s1,s2);
    }
    public boolean dfs(String s1,String s2)
    {
        //s1 smaller s2--bigger
        int i=0;
       
        String ch1[]=s1.split(" ");
        String ch2[]=s2.split(" ");
         int n1=ch1.length;
        int n2=ch2.length;
        while(i<n1 && ch1[i].equals(ch2[i]))
            i++;
        while(i<n1 && ch1[i].equals(ch2[n2-n1+i]))
            i++;
        
        return i==n1;
    }
}