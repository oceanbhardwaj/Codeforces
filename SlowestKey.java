class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
       
        int n=releaseTimes.length;
        
        
                 int min=releaseTimes[0];
                  char c= keysPressed.charAt(0);   
                                                  
         for(int i=1;i<n;i++)
         {
             if((releaseTimes[i]-releaseTimes[i-1])>=min)
             {
                 min=releaseTimes[i]-releaseTimes[i-1];
                 c=keysPressed.charAt(i); 
             }
         }
         return c;                                                           
        
    }
}