import java.util.Scanner;
class sample
{
   public static void main (String[] args)
 {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int r,sum=0;
       if(n>=0)
       {
           while(n!=0)
           {
               r=n%10;
               sum=sum*10+r;
               n=n/10;
           }
           if(n==sum)
           {
               System.out.println("Palindrome");
           }
           else
           {
               System.out.println("Not a Palindrome");
           }
       }
       else
       {
           System.out.println("Invalid Input");
       }
     
   }
}


