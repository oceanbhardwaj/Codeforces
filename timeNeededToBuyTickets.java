class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int count=0;
       
        while(tickets[k]>0)
        {
            for(int i=0;i<tickets.length;i++)
            {
                if(tickets[i]!=0 )
                {
                    count++;
                    tickets[i]--;
                   
                }
               
                if(tickets[k]==0 )
                       break; 
                
               
                
            }
           
            
        }
        return count;
        
    }
}