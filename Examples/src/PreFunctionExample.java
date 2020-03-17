import java.util.function.Function;
public class PreFunctionExample {
	public static void main(String[] args)
	{
		Function<String,Integer> fcount= s->{
			
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
				{
					count=count+1;
				}
			}
				return count;
		};
		System.out.println("vowel count in applr"+fcount.apply("apaple"));
		/*Function<String,Integer>f1=s->s.length();
		System.out.println("the length of string india is:"+f1.apply("india"));
		Function<Integer,Integer> f2=n->n*n;
		System.out.println("the square of 4 is"+f2.apply(4));
		Function<Integer,Integer>fact=x->{
			int f=1;
			for(int i=2;i<=x;i++)
				f=f*i;
			return f;
		};
		System.out.println("Favtorial of 4 is"+fact.apply(4));*/
	}

}
