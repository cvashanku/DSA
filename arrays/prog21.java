//program to find 1 to n max elements and 1 to n min elements

import java.util.*;

class test
{
  public static void main(String args[])
    {
      Scanner obj=new Scanner(System.in);
      System.out.println("enter array size:");
      int n=obj.nextInt();
      int[] a=new int[n];
      int i;
      System.out.println("enter "+n+" array elements:");
        for(i=0;i<n;i++)
          a[i]=obj.nextInt();
      System.out.println("Before sorting ===>"+Arrays.toString(a));
      Arrays.sort(a);
      System.out.println("After sorting ===>"+Arrays.toString(a));

      System.out.println("1st min element="+a[1-1]);
      System.out.println("2nd min element="+a[2-1]);
      System.out.println("3rd min element="+a[3-1]);

      System.out.println("1st max element="+a[n-1]);
      System.out.println("2nd max element="+a[n-2]);
      System.out.println("3rd max element="+a[n-3]);
    }
}