
class First{ 
  First()
	{System.out.print("From A");
	}
	}

 

public class Second extends First
{
  Second(int z)
  {
	  z=2;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Second(3);
	}

}
