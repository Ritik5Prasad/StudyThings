//ONE INTERFACE MULTIPLE METHODS- Aspecsts of POLYMORPHISM 
//interface is a blueprint of class it has a static constants and abstract methods
//interface is used to achieve abstraction
//interface is used to achieve multiple nheritance
//interface keyword is used to implement a interface..
// always implement interface mehod as public


//SIMPLE PROGRAM TO UNDERSTAND INTERFACE.....

package oops;
interface callback{
	void callback(int param);
}
class client implements callback{
	public  void callback(int p){
		System.out.println(p);
	}
}
public class Interfaces {
	public static void main(String args[]){
		callback c=new client();
		c.callback(42);
		
		
	}

}


//DIFFERECE BETWEEN INTERFACE AND ABSTRACT CLASS\
//  INTERFACE PROVIDE FULL ABSTRACTION BUT NOT ABSTRACT CLASS
//USING ABSTRACT WE CAN NOT ACHIEVE MULTIPLE INHERITANCE 
// BUT INTERFACE PROVIDE MULTIPLE INHERITANCE
//interface doesn't support declaration'int i=2
//in interface we can not use access specifier in this 
//all default public
//in interface member can not declare by static ,virtual etc keywords