//sorting of an array in descending order

import java.util.*;

class test
{
   public static void main(String arrgs[])
     {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter array size");
        int n=obj.nextInt();
        int[] a=new int[n];
        int i;
        System.out.println("enter "+n+" array elements");
        for(i=0;i<n;i++)
          a[i]=obj.nextInt();
        System.out.println("Before sorting ==>"+Arrays.toString(a));
        int j,t;
        for(i=0;i<n;i++)
         {
           for(j=i+1;j<n;j++)
             {
               if(a[i]<a[j])
                 {
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                 }         
             }
         }
        System.out.println("After sorting ==>"+Arrays.toString(a));
     }
}