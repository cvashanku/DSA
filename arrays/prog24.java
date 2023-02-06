//linear search--array need not be sorted

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
     System.out.println("enter key element to search:");
     int key=obj.nextInt();
     int index=-1;
     for(i=0;i<n;i++)
       {
          if(key==a[i])
            {
              index=a[i];
             break;
            }
       }
      System.out.println("Location ="+index);
   }
}