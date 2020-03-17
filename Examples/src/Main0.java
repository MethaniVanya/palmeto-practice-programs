class One{
int var1;
One (int x){
var1 = x;
}}
class Derived extends One{
	//Derived(int var2){
		
int var2;
void display(){
System.out.println("var 1="+var1+"var2="+var2);
}}

class Main0{
public static void main(String[] args){
Derived obj = new Derived();
obj.display();
}}

/*class Super{ //int x;
	Super(){x=2;}}
class Main0 extends Super {
	int y;
	void displayX(){
System.out.print(x);}
public static void main(String args[]){
   new Main0().displayX();}}*/