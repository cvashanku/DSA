//predefined methods are there to perform sorting operation

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
       System.out.println("enter "+n+" array elements");
       for(i=0;i<n;i++)
         a[i]=obj.nextInt();
       System.out.println("Before sorting ===>"+Arrays.toString(a));
       Arrays.sort(a);
       System.out.println("After sorting ===>"+Arrays.toString(a));
    }
}