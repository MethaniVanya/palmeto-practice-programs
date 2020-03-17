
public class EvenOdd 
{
  public EvenOdd()
   {
	   
   }

	public  void testnum(int n) throws EvenException ,OddException
	{
		// TODO Auto-generated method stub
		if(n%2==0)

	     throw new EvenException();

	     else
		 throw new OddException();
	}
}
