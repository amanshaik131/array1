/* JFM1T5_Assignment 4:

   Write a program to create a square matrix and print its transpose.
   Prompt the user input from the terminal.
   
  Sample Input:
  Enter number of rows: 3
  Enter number of columns: 3
  Elements  [1,1] : 2
  Elements  [1,2] : 3
  Elements  [1,3] : 4
  Elements  [2,1] : 1
  Elements  [2,2] : 2
  Elements  [2,3] : 3
  Elements  [3,1] : 4
  Elements  [3,2] : 5
  Elements  [3,3] : 6
   
  Expected Output:
    
  After Transpose Matrix  
  2       1       4
  3       2       5
  4       3       6
   
*/

import java.util.Scanner;

public class TransposeMatrix 
{
public static void main(String args[])
  {
    int i,j,rows,cols;
    System.out.println("enter the number of rows ");
    Scanner sc=new Scanner(System.in);
    rows=sc.nextInt();
    System.out.println("enter the number of columns ");
    cols=sc.nextInt();
    int a[][]=new int[rows][cols];
    int b[][]=new int[rows][cols];
    for(i=0;i<rows;i++)
      {
        for(j=0;j<cols;j++)
          {
        System.out.printf("enter the value of a[%d][%d]",i,j);
        Scanner obj=new Scanner(System.in);
        a[i][j]=obj.nextInt();
         b[j][i]=a[i][j];
          }
      }
    for(i=0;i<rows;i++)
      {
        for(j=0;j<cols;j++)
          {
            System.out.print(b[i][j]+" ");
          }
        System.out.println();
      }
  }

  
  
  
  
  
  
  
  
  
  
  
  
  
  //Define the main method

//Declare the variables

//Take input from user to enter rows and column values

//Convert the square matrix into transpose

//Print the transpose matrix

//printing j and i instead of i and j

}