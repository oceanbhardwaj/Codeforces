class Solution {
    public boolean winnerOfGame(String colors) {
        //max consecutive A's and B's
        //A's
        int counta=0;
        int max=0;
        for(int i=0;i<colors.length();i++)
        {
            if(colors.charAt(i)=='A')
            {counta++;
           
            }
            else
            {
                if(counta>=3)
                    max=max+counta-2;
                
                counta=0;
            }
            
           
        }
         if(counta>=3)
        max=max+counta-2;
        
       counta=max;
        System.out.println("counta :"+counta);
        int countb=0;
        max=0;
         for(int i=0;i<colors.length();i++)
        {
            if(colors.charAt(i)=='B')
            {countb++;
          
            }
            else
            {
                 if(countb>=3)
                    max=max+countb-2;
                countb=0;
            }
           
        }
         if(countb>=3)
        max=max+countb-2;
       
        countb=max;
        System.out.println("counta :"+counta +"count b: "+countb);
        return  counta>countb;
        
        
    }
}