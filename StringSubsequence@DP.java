
class Solution {
    int countWays(String s1, String s2) { 
       int n=s1.length();
       int m=s2.length();
       return dfs(s1,s2,n-1,m-1);
    }
    public int dfs(String s1,String s2,int n,int m)
    {
        if((n<0 && m<0)||(m<0))
        return 1;
        if(n<0)
        return 0;
        if(s1.charAt(n)==s2.charAt(m))
        return dfs(s1,s2,n-1,m-1)+dfs(s1,s2,n-1,m);
        return dfs(s1,s2,n-1,m);
    }
}