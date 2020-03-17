class x
{
	int i, j;

   x(int a, int b) {
    i = a;
    j = b;
  }
  void show() {
    System.out.println("i and j: " + i + " " + j);
  }
}
class y extends x {
  int k;

  y(int a, int b, int c) {
    super(a, b);
    k = c;
  }
  void show(String msg) {
    System.out.println(msg + k);
  }
}
class Override {
	
  public static void main(String args[]) {
	  
    y subOb = new y(3, 5, 7);
    subOb.show("This is k: "); // this calls show() in B
    subOb.show(); // this calls show() in A
  }


}

