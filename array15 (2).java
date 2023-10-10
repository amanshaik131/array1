import java.util.Scanner;
class array15
  {
    public static void main(String args[])
    {
      int i;
      System.out.println("enter the size of array is ");
      Scanner obj=new Scanner(System.in);
      int n=obj.nextInt();
      int a[]=new int[n+1];
    for(i=0;i<n;i++)
        {
          System.out.printf("enter the element of a[%d]",i);
          Scanner sc1=new Scanner(System.in);
          a[i]=sc1.nextInt();
        }
     System.out.print("enter the new element ");
      Scanner sc=new Scanner(System.in);
        int ne=sc.nextInt();
      System.out.print("enter the pos ");
      Scanner sc1=new Scanner(System.in);
      int pos=sc.nextInt();
      for(i=n-1;i>=pos;i--)
        {
          a[i+1]=a[i];
        }
      a[pos]=ne;
      for(i=0;i<n+1;i++)
        {
          System.out.println(a[i]);
        }
      System.out.println(a.length);
      
      
      
      
    }
  }