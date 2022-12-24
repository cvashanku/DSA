// min element  present in the array


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
       for(i=0;i<a.length;i++)
         a[i]=obj.nextInt();
       int max;
       max=a[0];
       for(i=1;i<n;i++)
        {
          if(max>a[i])
          max=a[i];
        }
       System.out.println("minimum element="+max);
    }
}