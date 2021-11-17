class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int count=0;
       
       for(int i=0;i<tickets.length;i++)
       {
           if(tickets[i]<tickets[k])
           {
               count=count+tickets[i];
           }
           else if(tickets[i]>=tickets[k] && i<=k)
           {
               count=count+tickets[k];
           }
           else if(tickets[i]>=tickets[k] && i>k)
           {
              count=count+tickets[k]-1; 
           }
       }
        return count;
    }
}