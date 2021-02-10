class Solution {
    public int minimumLength(String s) {
        int start=0;
        int start1=0;
        int n=s.length()-1;
        int end=n;
        int end1=0;
        while(start!=end && s.charAt(start)==s.charAt(end) )
        {
            char ch=s.charAt(start);
            start1=start+1;
            while(s.charAt(start1)==ch)
            {
                start1++;
                if(start1==s.length())
                    return 0;
            }
            end1=end-1;
            while(s.charAt(end1)==ch)
            {
                end1--;
            }
           
            s=s.substring(start1,end1+1);
            start=0;
            end=s.length()-1;
        }
        return s.length();
        
    }
}