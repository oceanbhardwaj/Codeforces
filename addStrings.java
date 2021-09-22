class Solution {
    public String addStrings(String num1, String num2) {
        String res="";
        int carry=0;
        int i=num1.length()-1;
        int j=num2.length()-1;
        while(i>=0 || j>=0)
        {
            int sum1=0;
            int sum2=0;
            if(i>=0)
                sum1=num1.charAt(i)-'0';
            if(j>=0)
                sum2=num2.charAt(j)-'0';
            
            
            int sum=carry+sum1+sum2;
            System.out.println(sum);
            carry=sum/10;
            sum=sum%10;
            res=sum+res;
            i--;
            j--;
                
        }
        if(carry!=0)
            res=carry+res;
        
        return res;
    }
}