//program to copy data from one file to another file 

import java.io.*;

class demo
{
     public static void main(String args[])
      {
     try{
       FileInputStream fis=new FileInputStream(args[0]);
       int n=fis.available();
       byte[] b=new byte[n];
       fis.read(b);
       FileOutputStream fos=new FileOutputStream(args[1]);
       fos.write(b);
      }catch(Exception e)
       {
         System.err.println(e);
       }
   }
}