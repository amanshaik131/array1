//remove  the new element based on the position to the array
import java.util.Scanner;

class array14 {
  public static void main(String args[])
    {
      int i;
      System.out.println("enter the size of an array ");
      Scanner obj=new Scanner(System.in);
      int n=obj.nextInt();
      int a[]=new int[n];
      for(i=0;i<n;i++)
        {
          System.out.printf("enter the value of a[%d]",i);
          Scanner sc=new Scanner(System.in);
          a[i]=sc.nextInt();
        }
System.out.println("enter the position ");
  int pos=obj.nextInt();
   for(i=pos;i<n-1;i++)
     {
       a[i]=a[i+1];
     }
      for(i=0;i<n-1;i++)
        {
          System.out.println("the elements are "+ a[i]);
        }
    }
}
  