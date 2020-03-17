import java.util.Scanner;

/*import java.util.Scanner;

class AgeException extends Exception {
 
 public AgeException(String str) {
  System.out.println(str);
 }
}
public class ExceptionAge {
 
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter age : ");
  int age = sc.nextInt();
   try {
   if(age < 18) 
    throw new AgeException("Invalid");
   else
    System.out.println("Valid");
  }
  catch (AgeException e) {
   System.out.println(e);
  }
 }
 }

*/
import java.util.Scanner;
class InvalidAgeException extends Exception{
public InvalidAgeException()
{
super("Age is Negative");
}
}
class InsufficientAgeException extends Exception{
public InsufficientAgeException()
{
super("Age is Lessthan 18");
}

}
class Valid {
public void testAge(int age) throws InsufficientAgeException,InvalidAgeException
{
if(age>0 && age<18)
throw new InsufficientAgeException();
else if(age<0)
throw new InvalidAgeException();
else
System.out.println("Eligible");
}
}
public class ExceptionAge {
public static void main(String[] args) {

int Age;
Scanner sc=new Scanner(System.in);
System.out.println("Enter age:");
Age=sc.nextInt();
Valid v=new Valid();
try
{
v.testAge(Age);
}
catch(InsufficientAgeException e)
{
System.out.println(e);
}
catch(InvalidAgeException e)
{
System.out.println(e);
}
}

}

