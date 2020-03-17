import java.util.Scanner;

public class TestVoting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int age;
 Scanner s=new Scanner(System.in);
 System.out.println("enter your age");
 age=s.nextInt();
 voting vote=new voting();
 try {
	 vote.testAge(age);
 }
 catch(InvalidAgeException e)
 {
	 System.out.println(e);
 }
 catch(InsufficientAgeException e)
 {
	 System.out.println(e);
 }
	}

}