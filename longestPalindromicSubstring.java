class Solution {
    public String longestPalindrome(String s) {
       int max=1;
        int start=0;
        int end=0;
        for(int i=0;i<s.length();i++){
            int left=i-1;
            int right=i+1;
              while( right<s.length() && s.charAt(right)==s.charAt(i))
                right++;
            while(left>=0  && s.charAt(left)==s.charAt(i))
                left--;
          
           while(left>=0 && right<s.length() && left<right && s.charAt(left)==s.charAt(right) )
           { left--;
            right++;}
           if(max<(right-left-1)){
               start=left+1;
               
               max=right-left-1;
               
           }
        }
        return s.substring(start,start+max);
        
    }
}