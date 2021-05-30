class Solution {
    public String maxValue(String n, int x) {
        boolean isNeg=false;
        if(n.charAt(0)=='-')
        {
            isNeg=true;
            n=n.substring(1);
        }
        for(int i=0;i<n.length();i++)
        {
            int curr=n.charAt(i)-'0';
            if(!isNeg && x>curr || isNeg && curr>x)
                return( isNeg?"-":"")+n.substring(0,i)+x+n.substring(i);
        }
        return (isNeg?"-":"")+n+x;
    }
}