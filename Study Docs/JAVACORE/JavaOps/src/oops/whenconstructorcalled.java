// IN SUBCLASS AND SUPERCLASS WHICH CONSTRUCTOR IS CALLED FIRST 
//ANSWER IS IN ORDER OF DERIVIATION FORM SUPERCLASS TO SUBCLASS SUPER EXECUTED FIRST STATEMENT IN SUBCLASS
package oops;
class A{
	A(){
		System.out.println("CLASS A CONSTRUCTAR");
	}
}
class B extends A{
	B(){
		System.out.println("CLASS B ");
	}
}
class C extends B{
C(){System.out.println("CLASS C");}
}
public class whenconstructorcalled {
	public static void main(String args[])
	{
		C c=new C();
	}
}
