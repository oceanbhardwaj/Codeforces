class Solution {
    public boolean canBeValid(String s, String locked) {
       boolean leftToRightFlag=true;
        boolean rightToLeftFlag=true;
        if(s.length()%2==1)
            return false;
        int closed=0;
        int opened=0;
        int unlocked=0;
        //left to right
        for(int i=0;i<s.length();i++)
        {
            if(locked.charAt(i)=='0')
                unlocked++;
            else if(s.charAt(i)=='(')
                opened++;
            else
                closed++;
            
            if((opened+unlocked)<closed)
            {
               return false;
            }
                
        }
        closed=0;
         opened=0;
         unlocked=0;
        //right to left
        for(int i=s.length()-1;i>=0;i--)
        {

        if(locked.charAt(i)=='0')
                unlocked++;
            else if(s.charAt(i)=='(')
                opened++;
            else
                closed++;
            
            if(opened>(closed+unlocked))
            {
                return false;
            }
        
        
        }
        return true;
    }
}