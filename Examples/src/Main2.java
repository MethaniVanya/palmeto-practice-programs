import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter first number");
		int a = scanner.nextInt();
		System.out.println("enter second number");
		int b = scanner.nextInt();
		System.out.println("enter third number");
		int c = scanner.nextInt();
		System.out.println(UserMainCode2.findRoots(a,b,c));
		

	}

}
