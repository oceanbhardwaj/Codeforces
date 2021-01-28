/*package whatever //do not write package name here */

import java.util.*;

class GFG {
   static class Pair
    {
        int x;
        int y;
        int d;
        
        Pair(int x,int y,int d)
        {
            this.x=x;
            this.y=y;
            this.d=d;
            
        }
    }
        
    
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext())
		{
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    int d=sc.nextInt();
		    int dist[][]=new int[8][8];
		    for(int i=0;i<8;i++)
		    {
		        for(int j=0;j<8;j++)
		        {
		            dist[i][j]=Integer.MAX_VALUE;
		        }
		    }
		    boolean state[][]=new boolean[8][8];
		    PriorityQueue<Pair> pq=new PriorityQueue<>((o1,o2)->o1.d-o2.d);
		    pq.add(new Pair(a,b,0));
		    dist[a][b]=0;
		  //  int arr[]={-2,-2,-1,1,2,2,-2,1};
		  //  int brr[]={-1,1,2,2,-1,1,-2,2};
		  int arr[]={-2,-2,-1,1,2,2,1,-1};
	int brr[]={-1,1,2,2,1,-1,-2,-2};
		    int ans=-2;
		    int flag=0;
		    if(c>=8 || d>=8 || c<0 || d<0)
		    {ans=-1;
		    flag=1;}
		    else{
		    while(!pq.isEmpty())
		    {
		        Pair p=pq.poll();
		        int aa=p.x;
		        int bb=p.y;
		        int dist1=p.d;
		        if(state[aa][bb])
		        continue;
		        state[aa][bb]=true;
		        if(aa==c && bb==d)
		        {
		            flag=1;
		            ans=dist[aa][bb];
		            break;
		        }
		        for(int i=0;i<8;i++)
		        {
		            int xx=aa+arr[i];
		            int yy=bb+brr[i];
		            if(xx>=0 && xx<8 && yy>=0 && yy<8 && !state[xx][yy])
		            {
		                int new1=aa*xx+bb*yy;
		                int act=new1+dist[aa][bb];
		                if(act<dist[xx][yy])
		                {
		                    dist[xx][yy]=act;
		                    pq.add(new Pair(xx,yy,act));
		                }
		                
		                
		            }
		        }
		    }
		    }
		    if(flag==0)
		    ans=-1;
		    System.out.println(ans);
		    
		}
	}
}