/*  
    JFM1T5_Assignment 1:
    Write a program to store 10 numbers in an array and display the sum of all the elements.
    Prompt the user for the 10 numbers to be input from the terminal.
    Sample Input:
    Enter the 10  elements:
    1
    2
    3
    4
    5
    6
    7
    8
    9
    10
    Expected Output:
    Sum of array elements is : 55

*/
import java.util.Scanner;
public class ArraySum 
{
public static void main(String args[])
  {
    int i,sum=0,n;
    System.out.println("enter how many numbers to be stored");
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    int a[]=new int[n];
    for(i=0;i<n;i++)
      {
        System.out.printf("enter the values  of a[%d]",i);
        Scanner sc=new Scanner(System.in);
        a[i]=sc.nextInt();
      }
    for(i=0;i<n;i++)
      {
        sum=sum+a[i];
      }
    System.out.println("Sum of array elements is" + " "+sum);
  }

  
  
  
  
  
  
  //Define the main method

//Declare the variables and initialize

//Take input from user

//Check user input values using for loop and add all values
 
//Print the result

}
