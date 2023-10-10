import java.util.Scanner;
class array19
  {
    public static void main(String args[])
    {
      int i,sum=0,dup,r;
      System.out.println("enter the size of an array ");
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
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
          if(sum==a[i])
          {
            System.out.println(sum);
          }

        }
    }
  }
  