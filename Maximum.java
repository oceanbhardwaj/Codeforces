import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++)
     {
         arr[i]=sc.nextInt();
     } 
     int q=sc.nextInt();
     for(int k=0;k<q;k++){
     int w=sc.nextInt();
     if(w==1 || w==2)
     {
         int l=sc.nextInt();
         int r=sc.nextInt();
         int x=sc.nextInt();
         if(w==1)
         {
        l=l-1;
        r=r-1;
        for(int j=l;j<=r;j++)
        {
            arr[j]=arr[j]+x;
        }
         }
         else if(w==2)
         {
             l=l-1;
        r=r-1;
        for(int j=l;j<=r;j++)
        {
            arr[j]=arr[j]*x;
        }
         }
     }
     else if(w==3)
     {
         int z=sc.nextInt();
         int index1=0;
         int index2=0;
         for(int i1=0;i1<n;i1++)
         {
             if(arr[i1]==z)
             {index1=i1;
             break;}
         }
         for(int h=n-1;h>index1;h--)
         {
             if(arr[h]==z)
             {
                 index2=h;
                 break;
             }
         }
         int ans=index2-index1+1;
         System.out.println(ans);
         


    }
     }

}}
