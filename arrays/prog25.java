//binary search -->array should be sorted first

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
      System.out.println("enter "+n+" array elements");
      for(i=0;i<n;i++)
        a[i]=obj.nextInt();
      System.out.println("before sorting===>" +Arrays.toString(a));
      Arrays.sort(a);
      System.out.println("after sorting===>" +Arrays.toString(a));
      System.out.println("enter key element to search");
      int key=obj.nextInt();

      int index=-1;
      int low,high,mid;
      low=0;
      high=n-1;
      
      while(low<=high)
       {
         mid=(low+high)/2;
         if(a[mid]==key)
           {
              index=key;
              break;
           }
          else if(a[mid]>key)
               high=mid-1;
          else
               low=mid+1;
       }
      System.out.println("location=" +index);
   }
}







