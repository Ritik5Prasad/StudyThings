package Cls;
// inheritance-To adopt Something  It can be used by "extends" keyword..
class A{
	/*private*/ int i,j;            //IF WE USE PRIVATE THEN IT CAN NOT BE ACCESSED BY CLASS B AND CODE DONT COMPILE
	void show(){
		System.out.println("Hello I am in class A"+i+" "+j);
	}
}
class B extends A{              
	int k;
	void showk(){
		System.out.println("I am in class B"+" "+k);
	}	void sum(){
			System.out.println("i+j+k"+" "+(i+j+k));
		}
	}


public class Inheritance {
public static void main(String args[])
{
A superob=new A();
B subob=new B();
superob.i=10;
superob.j=20;
subob.k=4;
superob.show();
subob.i=8;     //subclass i inheriting the int property of superclass A
subob.j=9;
subob.show();  // This method is inheriting the A contents which is i and j
subob.sum();
subob.showk();

}
}
