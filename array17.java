import java.util.Scanner;
class array17
  {
    public static void main(String args[])
    {
      int i,j,temp;
      System.out.println("enter the size of an array ");
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int a[]=new int[n];
      for(i=0;i<n;i++)
        {
          System.out.println("enter the elements to be sorted ");
          Scanner sc=new Scanner(System.in);
          a[i]=sc.nextInt();
        }
      for(i=0;i<n;i++)
        {
          for(j=i+1;j<n;j++)
            {
              if(a[i]<a[j])
              {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
              }
            }
        }
      for(i=0;i<n;i++)
        {
          System.out.println(a[i]);
        }
    }
  }