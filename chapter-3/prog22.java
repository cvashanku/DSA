//customized sorting by using predefined method Arrays.sort(a,begin,end)

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
      System.out.println("before sorting==>"+ Arrays.toString(a));
     // Arrays.sort(a);
     // System.out.println("after sorting==>" +Arrays.toString(a));
      System.out.println("enter begin location:");
      int begin=obj.nextInt();
      System.out.println("enter end location:");
      int end=obj.nextInt();
      Arrays.sort(a,begin,end);//begin including and end excluding
      System.out.println("customized sorting==>" +Arrays.toString(a));
   }
}