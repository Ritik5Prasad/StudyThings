//self exception handler can make the program from automayically terminate and you easily fix the error

package oops;

public class Usingtryandcatch {
public static void main(String args[]){
	
	int d,a;
try{
	d=0;
	a=3/d;
	System.out.println("this will neve r execute");
}
catch(ArithmeticException e){
	System.out.println("Division by zero"+" "+e);    //Display an execepttion only use when we  have to experiment

a=0;} //setting a=0 if exception occurs
System.out.println("After catch"+a);	
}
}
