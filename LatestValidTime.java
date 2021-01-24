class Solution {
    public String maximumTime(String time) {
       char str[]=time.toCharArray();
        if(str[0]=='?')
        {
            if(str[1]!='?'  && Integer.parseInt(str[1]+"")<=3)
                str[0]='2';
            else if(str[0]=='?' && str[1]=='?')
            {
                str[1]='3';
                str[0]='2';
            }
            else
                
                str[0]='1';
                
        }
        
     
        if(str[1]=='?')
        {
            if(str[0]!='?'  && Integer.parseInt(str[0]+"")==2)
               str[1]='3';
            
            else
                str[1]='9';
                
        }
       
        
        
        if(str[3]=='?')
        {
           
                str[3]='5';
        }
        
        if(str[4]=='?')
        {
           
               str[4]='9';
        }
       
        String s="";
       for(int i=0;i<str.length;i++)
       {
           s=s+str[i];
       }
        
        return s;
    }
}