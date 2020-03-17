import java.util.function.Predicate;
class User
{
	String uid;
	String pwd;
	public User(String uid,String pwd)
	{
		super();
		this.uid=uid;
		this.pwd=pwd;
	}
}
public class UserPredTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     User user1= new User("admin","1234");
     User user2 = new User("moni","dhsg");
     Predicate<User>tuser=u->u.uid.equals("admin")&&u.pwd.equals("1234");
     if(tuser.test(user2))
    	 System.out.println("valid user");
     else
    	 System.out.println("invalid");
	}

}
