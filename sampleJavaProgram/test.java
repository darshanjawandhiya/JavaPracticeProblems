package sampleJavaProgram;

//class test
//{
//   static void update(int A[])
//   {
//	   A[0]=25; 
//   }
//   public static void main(String args[])
//   {
//      int A[]={2,3,4,5,6};
//      update(A);
//      System.out.println(A[0]);
//   }
//}
class test
{
   static int add(int x, int y)
   {
     int z;
     z=x+y;
     return z;
   }
   public static void main(String args[])
   {
      int a=10,b=5,c;
      c=add(a,b);
      System.out.println(c);
   } 
}
