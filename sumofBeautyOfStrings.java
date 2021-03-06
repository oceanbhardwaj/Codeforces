class Solution {
    
    public int beautySum(String s) {
         
        int count=0;
        for(int i=0;i<s.length();i++)
		{  HashMap<Character,Integer> map=new HashMap<>();
          
			for(int j=i;j<s.length();j++)
			{
           map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
                int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for(Character i1:map.keySet())
            {   
                min=Math.min(min,map.get(i1));
                
                 max=Math.max(max,map.get(i1));
               
            }
                
            count=count+max-min;
            
            }
        
        }
            
            
        
        return count;
        
        
        
        
    }
    
    
    

}
/////////////////////////////////////////////////////////////////
class Solution {
    
    public int beautySum(String s) {
         
        int count=0;
        for(int i=0;i<s.length();i++)
		{  int countArray[]=new int[26];
          
			for(int j=i;j<s.length();j++)
			{ countArray[s.charAt(j)-'a']++;
          
                int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for(int k=0;k<26;k++)
            {   
                if(countArray[k]==0)
                    continue;
                min=Math.min(min,countArray[k]);
                
                 max=Math.max(max,countArray[k]);
               
            }
                
            count=count+max-min;
            
            }
        
        }
            
            
        
        return count;
        
        
        
        
    }
    
    
    

}