class Solution {
 int d;
    int count1=0;
    public boolean canPartitionKSubsets(int[] nums, int k) {
         
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++)
		    {
		        
		        sum=sum+nums[i];
		        
		    }
        Arrays.sort(nums);
        int target=sum/k;
         
        int row=nums.length-1;
         d=sum/k;
        if(nums[row]>target)
            return false;
        while(row>0 && nums[row]==target)
        {
         
            row--;
            k--;
        }
		   ArrayList<ArrayList<Integer>> aa=new ArrayList<>();
		for(int i=0;i<k;i++)
		{
			aa.add(new ArrayList<Integer>());
		}
		        int subsetsum[]=new int[k];
               
		        dfs(aa,row,0,k,n,nums,subsetsum);
		        //System.out.println(flag);
		        if(count1>=1)
		         return true;
		         else
		         return false;
		        
		    
		    
      //return true;
    }
    	public   void dfs(ArrayList<ArrayList<Integer>> aa,int row,int count,int k,int n,int arr[],int subsetsum[])
	{
if(row<0)
{
    
  if(count==k){
      boolean f=true;
  for(int i1=0;i1<subsetsum.length-1;i1++)
  {
      if(subsetsum[i1]!=subsetsum[i1+1])
      {
          f=false;
          break;
      }
  }
      if(f==true )
          count1++;
      
      
      
  
}
return;




}




      for(int j=0;j<aa.size();j++) //arraylist traverse 
     {//System.out.println("line 12");
          if(subsetsum[j]>d)
              return;
     if(aa.get(j).size()>0)
     {
     	//System.out.println("line 11");
     	aa.get(j).add(arr[row]);
         subsetsum[j]+=arr[row];
         
     	dfs(aa,row-1,count,k,n,arr,subsetsum);
          subsetsum[j]-=arr[row];
        
     	aa.get(j).remove(aa.get(j).size()-1);

     }
     else
     { //System.out.println("line 1");
     	aa.get(j).add(arr[row]);
          subsetsum[j]+=arr[row];
        
     	//System.out.println("line 2");
     	dfs(aa,row-1,count+1,k,n,arr,subsetsum);
         subsetsum[j]-=arr[row];
         
     	aa.get(j).remove(aa.get(j).size()-1);

     	break;
     }
     }
	}
	
	
		
	
		
		
		
		
		
		
		
		
		
		
	
}