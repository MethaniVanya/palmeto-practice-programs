
interface Drawing{
	//public void draw();
  public float add(float a,float b);
}

/*class Circle implements Drawing{
	public void draw()
	{
		System.out.println("circle is drawn");
	}
}*/

public class TestInterface {

	public static void main(String[] args) {
       // Drawing d=()->System.out.println("cicle is drawn"); 
        //d.draw();
		 Drawing d=(a,b)->a+b;
          System.out.println( d.add(20,30));
          
		// TODO Auto-generated method stub

	}

}
