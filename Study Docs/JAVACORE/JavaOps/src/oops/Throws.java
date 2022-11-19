//if a method exception cant be handle then you have to guard the caller so thatswhy we use throws
package oops;

public class Throws {          //exception list
static void throwone() throws ArithmeticException{
	throw new ArithmeticException("demo");
}
public static void main(String args[]){
	try{
		throwone();
	}catch(ArithmeticException e){
		System.out.println("Caught "+e);
	}
}
}
