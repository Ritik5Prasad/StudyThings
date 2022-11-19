package Cls;
class overload{
	int a; int b;
	int add(int a,int b){
		return a+b;}
	//METHOD OVERLOADED	Upper method with Two Parameters but Below method with no parameters 
	//THis Called MeThod Overloading
	int add(){
			return 0;
		}
	}

public class ovrload {
public static void main(String args[]){
	overload c=new overload();

System.out.println(c.add(4,5));
System.out.println(c.add());
}
}