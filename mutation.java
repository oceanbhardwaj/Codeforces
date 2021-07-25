class Solution {
    public String maximumNumber(String num, int[] change) {
        char str[]=num.toCharArray();
        boolean mutation=false;
        int count=0;
        for(int i=0;i<str.length;i++)
        {
            int d=str[i]-'0';
            if((d<=change[d] && mutation) || (count==0 && d<change[d]))
            { 
                count++;
                str[i]=(char)(change[d]+'0');
                mutation=true;
                
            }
            else 
            {
                mutation=false;
            }
                
        }
        return new String(str);
        
    }
}