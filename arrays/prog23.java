//customized sorting by using manually

import java.util.*;

class test
{
  public static void main(String args[])
   {
     Scanner obj=new Scanner(System.in);
     System.out.println("enter array size");
     int n=obj.nextInt();
     int[] a=new int[n];
     int i;
     System.out.println("enter "+n+" array elemnts");
     for(i=0;i<n;i++)
       a[i]=obj.nextInt();
     System.out.println("before sorting==>" +Arrays.toString(a));
     System.out.println("enter begin location");
     int begin=obj.nextInt();
     System.out.println("enter end location");
     int end=obj.nextInt();
     int j,t;
     for(i=begin;i<end;i++)
       {
         for(j=i+1;j<end;j++)
           {
              if(a[i]>a[j])
                {
                  t=a[i];
                  a[i]=a[j];
                  a[j]=t; 
                }
           }
       }
      System.out.println("customized sorting===>" +Arrays.toString(a));
   }
}