class Solution {
    public int findComplement(int num) {
        //how to check for set bits if(1<<i & num!=0)//set
        int res=0;
        int i=0;
        
        while(num>0)
        {
           
            if((num & 1 )==0)
            {
                
            res=res|(1<<i);
                 
            }
            i++;
          
            num=num>>1;
        }
        return res;
    }
}