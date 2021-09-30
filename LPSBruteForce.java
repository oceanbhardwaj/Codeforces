class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==0)
            return "";
        int max=1;
        String ans=s.charAt(0)+"";
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<=s.length();j++)
            {
                String str=s.substring(i,j);
                if(str.length()>max && isPalindrome(str) )
                {
                    max=str.length();
                    ans=str;
                }
            }
        }
        return ans;
    }
    public boolean isPalindrome(String s)
    {
        if(s.isEmpty())
            return true;
        int left=0;
        int right=s.length()-1;
        while(left<right)
        {
            if(s.charAt(left)!=s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}