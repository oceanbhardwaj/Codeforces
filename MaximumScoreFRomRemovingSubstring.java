class Solution {
    public int maximumGain(String s, int x, int y) {
        int sum=0;
       
        Stack<Character>s1=new Stack<>();
        StringBuilder sb1=new StringBuilder();
        
        for(int i=0;i<s.length();i++)
        {
            if(x>y && sb1.length()!=0 && sb1.charAt(sb1.length()-1)=='a' && s.charAt(i)=='b')
            {
                
                   sum=sum+x;
                    sb1.deleteCharAt(sb1.length()-1);
                
            }
            
           
            else if(y>x && sb1.length()!=0 && sb1.charAt(sb1.length()-1)=='b' && s.charAt(i)=='a')
            {
                
                
                    sum=sum+y;
                    sb1.deleteCharAt(sb1.length()-1);
                
            }
            
            else 
               sb1.append(s.charAt(i));
            
        }
        String s2=sb1.toString();
        StringBuilder sb2=new StringBuilder();
        for(int i=0;i<s2.length();i++)
        {
            if(x>y && sb2.length()!=0 && sb2.charAt(sb2.length()-1)=='b' && s2.charAt(i)=='a')
            {
                
                   sum=sum+y;
                    sb2.deleteCharAt(sb2.length()-1);
                
            }
            
           
            else if(y>x && sb2.length()!=0 && sb2.charAt(sb2.length()-1)=='a' && s2.charAt(i)=='b')
            {
                
                
                    sum=sum+x;
                    sb2.deleteCharAt(sb2.length()-1);
                
            }
            
            else 
               sb2.append(s2.charAt(i));
            
            
        }
  
    return sum;
        
    }
}