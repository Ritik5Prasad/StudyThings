// A SUPERCLASS REFER TO THE SUBCLASS OBJECT
//SUPER -METH1 METH2                 SUB-METH2(OVERRIDDEN) METHD3

// OVERRIDDEN IS USED TO SUPPORT RUN TIME POLYMORPHISM
package oops;
class r{
	void show(){
		System.out.println("Super class");
	}
	void show2(){
		System.out.println("Superclass meth 2");
	}
}
class s extends r{
	void show2(){
		System.out.println("Subclass meth 2");
	}void show3(){
		System.out.println("Subclass meth 3");
	}
}
public class dyanamicmethoddipsatch {
public static void main(String args[]){
	r obj=new s();
	//s obj=new r(); this not allowed //craeting object reference of r but refers to s
	obj.show2();
	//obj.show3(); this also not allowed because superclass object cannot refer to the subclass method
obj.show();
}

}
