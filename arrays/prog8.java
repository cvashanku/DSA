//program to demonstrate how many ways to print the array elements

import java.util.*;

class test
{
   public static void main(String args[])
     {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter size of an array:");
        int n=obj.nextInt();
        int[] a=new int[n];
        int i;
        System.out.println("enter "+n+" array elements:");
          for(i=0;i<n;i++)
             a[i]=obj.nextInt();

        System.out.println("print array elements by using while loop");
          int index=0;
          while(index<a.length)
           {
             System.out.println(a[index]);
              index++;
           }

        System.out.println("print array elements by using for loop");
          for(i=0;i<a.length;i++)
             System.out.println(a[i]);

        System.out.println("print array elements by using enhanced for loop");
          for(int item:a)
            System.out.println(item);
     }
}