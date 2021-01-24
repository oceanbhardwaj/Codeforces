class Solution {
    public int minCharacters(String a, String b) {
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        int min3=Integer.MAX_VALUE;
        for(int i=98;i<=122;i++) //checking first condition
        {
            char c=(char)i;
            int count=0;
            for(int j=0;j<a.length();j++)
            {
                if(a.charAt(j)>=c)
                    count++;
            }
            for(int i1=0;i1<b.length();i1++)
            {
                if(b.charAt(i1)<c)
                    count++;
                
            }
            min1=Math.min(min1,count);
            
        }
        for(int i=98;i<=122;i++) //checking scond condition
        {
            char c=(char)i;
            int count1=0;
            for(int j=0;j<a.length();j++)
            {
                if(a.charAt(j)<c)
                    count1++;
            }
            for(int i1=0;i1<b.length();i1++)
            {
                if(b.charAt(i1)>=c)
                    count1++;
                
            }
            min2=Math.min(min2,count1);
            
        }
        //checking third cndition
       int c1[]=new int[26];
        int c2[]=new int[26];
        for(int i=0;i<a.length();i++)
        {
            c1[a.charAt(i)-97]++;
        }
        int max1=0;
        int max2=0;
        for(int i=0;i<26;i++)
        {
            max1=Math.max(c1[i],max1);
        }
          for(int i=0;i<b.length();i++)
        {
            c2[b.charAt(i)-97]++;
        }
        for(int i=0;i<26;i++)
        {
            max2=Math.max(c2[i],max2);
        }
        // System.out.println(max1);
        // System.out.println(max2);
        min3=a.length()-max1+b.length()-max2;
       //  System.out.println(min3);
        min1=Math.min(min1,min2);
        min1=Math.min(min1,min3);
        return min1;
        
        
    }
}