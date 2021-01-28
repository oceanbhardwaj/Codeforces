/*package whatever //do not write package name here */

import java.util.*;

class GFG {
    static LinkedList<Pair> adj[];
    
   static class Pair{
        int s;
        
        int dist;
        Pair(int s,int dist)
        {
            this.s=s;
            
            this.dist=dist;
        }
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int e=sc.nextInt();
		adj=new LinkedList[n+1];
		for(int i=0;i<=n;i++)
		{
		    adj[i]=new LinkedList<>();
		}
		int distance[]=new int[n+1];
		boolean visited[]=new boolean[n+1];
		
		for(int i=0;i<e;i++)
		{
		    int s=sc.nextInt();
		    int d=sc.nextInt();
		    int dist=sc.nextInt();
		    makeGraph(s,d,dist);
		}
		Arrays.fill(distance,Integer.MAX_VALUE);
		distance[1]=0;
		Comparator co=new Comparator<Pair>(){
		    public int compare(Pair p1,Pair p2)
		    {
		        return p1.dist-p2.dist;
		    }
		};
		PriorityQueue<Pair> q=new PriorityQueue<>(co);
		q.add(new Pair(1,0)); //s,dist
		while(!q.isEmpty())
		{
		    Pair p=q.poll();
		    int source=p.s;
		    int distance1=p.dist;
		    if(visited[source])
		    continue;
		    visited[source]=true;
		    for(int i=0;i<adj[source].size();i++)
		    {
		        Pair pp=adj[source].get(i);
		        int ss=pp.s;
		        int dd=pp.dist;
		        int act=distance1+dd;
		        if(!visited[ss] && act<distance[ss])
		        {
		            distance[ss]=act;
		            q.add(new Pair(ss,act));
		            
		        }
		        
		    }
		    
		}
		for(int i=1;i<=n;i++)
		    {
		        System.out.println(distance[i]+"  ");
		    }
	}
	static void makeGraph(int s,int d,int dist)
	{
	    adj[s].add(new Pair(d,dist));
	    adj[d].add(new Pair(s,dist));
	}
}