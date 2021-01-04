class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Comparator co=new Comparator<int[]>()
        {
            public int compare(int a[],int b[])
            {
                return b[1]-a[1];
            }
            
        };
        Arrays.sort(boxTypes,co);
        int sum=0;
        int count=0;
        for(int a[]:boxTypes)
        {
            //count=count+a[0];
            for(int i=0;i<a[0];i++)
            { if(count<truckSize)
            {
              sum=sum+a[1];
                count++;
                
            }
             if(count>truckSize)
                    break;
             
            }
            if(count>truckSize)
                    break;
        }
        return sum;
        
    }
}