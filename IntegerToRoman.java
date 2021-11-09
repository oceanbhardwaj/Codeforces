class Solution {
    class Numerals
    {
     public String sym;
     public int val;
     public Numerals(String sym,int val)
     {
         this.sym=sym;
         this.val=val;
     
     
     }
    
    
    }
    public String intToRoman(int num) {
       
        Numerals numerals[]={
                              new Numerals("M",1000),
                               new Numerals("CM",900),
                              new Numerals("D",500),
                               new Numerals("CD",400),
                                new Numerals("C",100),
                                 new Numerals("XC",90),
                               new Numerals("L",50),
                               new Numerals("XL",40),
                               new Numerals("X",10),
                                new Numerals("IX",9),
                               new Numerals("V",5),
                               new Numerals("IV",4),
                               new Numerals("I",1),
                              
                             };
        StringBuilder ans=new StringBuilder();
        for(Numerals nums:numerals)
        {
            int calVal=num/nums.val;
            if(calVal!=0)
            ans.append(nums.sym.repeat(calVal));
            
            num=num%nums.val;
            if(num==0)
                break;
            
            
        }
        return ans.toString();
        
    }
}