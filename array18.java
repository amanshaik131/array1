//reverse the elements in the array
import java.util.*;
class array18
  {
    public static void main(String args[])
    {
      int i,sum=0,r,dup,n;
      System.out.print("enter the size of array ");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      int a[]=new int[n];
      for(i=0;i<n;i++)
        {
          System.out.println("enter the elements ");
          Scanner sc1=new Scanner(System.in);
          a[i]=sc1.nextInt();
        }
      for(i=0;i<n;i++)
        {
          dup=a[i];
          sum=0;
          while(dup>0)
            {
              r=dup%10;
              sum=sum*10+r;
              dup=dup/10;
            }
          a[i]=sum;
        }
      for(i=0;i<n;i++)
        {
          System.out.println(a[i]);
        }
    }
  }