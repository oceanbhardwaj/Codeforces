class Solution {
    public int totalMoney(int n) {
        int mon=1;
        int day=0;
        int sum=0;
        while(day!=n)
        {
            sum=sum+mon;
            day++;
            if(day==n)
                break;
            for(int i=mon+1;i<mon+1+6;i++)
            {
                sum=sum+i;
                day++;
                if(day==n)
                    break;
            }
            mon++;
        }
        return sum;
        
    }
}