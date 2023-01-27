/*
9) StringBuffer append(obj) --> it appends (adds last) the given object
10) StringBuffer insert(int,obj) --> it adds the given obj at location
11) StringBuffer delete(int,int) --> it deletes the content from begin to end-1
*/

class Test
{
  public static void main(String args[])
    {
       StringBuffer sb=new StringBuffer();
       System.out.println(sb);//
       sb.append("python ");
       sb.append("and ");
       sb.append("java ");
       sb.append("programming");
       System.out.println(sb);//python and java programming
       sb.insert(0,"welcome ");
       System.out.println(sb);//welcome python and java programming
       sb.insert(8,"to ");
       System.out.println(sb);//welcome to python and java programming
       sb.delete(11,22);
       System.out.println(sb);
    }
}