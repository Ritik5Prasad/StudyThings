package oops;                                     //Abstarct class -it does not contain any method body but extend class must 
abstract class abs{                                  //have abstarct method body
	abstract void callme();                                  //class name also be abstract todefine a abstract method in it
	void callmeto(){System.out.println("hello");}
}
class ab extends abs{
	 

	void callme() {
		// Abstaract class ,method
		
	}
}
public class abstractclass {
public static void main(String args[]){
	ab a=new ab();
	a.callme();
}
}
