class Solution {
    public String multiply(String num1, String num2) {
        int n=num1.length();
        int m=num2.length();
        int k=n+m-1;
        int res[]=new int[n+m];
        int carry=0;
        int prod=1;
        int end=k;
        
        for(int i=m-1;i>=0;i--)
        {  k=end;
           carry=0;
            for(int j=n-1;j>=0;j--)
            {
                prod=(num1.charAt(j)-'0')*(num2.charAt(i)-'0')+carry+res[k];
                res[k]=prod%10;
                carry=prod/10;
                k--;
            }
            if(carry!=0)
                res[k]=carry;
            end--;
            
        }
        StringBuilder sb=new StringBuilder();
        boolean flag=false;
        for(int i:res)
        {
            if(i==0 && !flag)
                continue;
            sb.append(i+"");
            flag=true;
        }
        return sb.toString().length()==0?"0":sb.toString();
    }
}