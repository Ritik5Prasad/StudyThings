//CREATING PROGRAM TO THROW EXCEPTION WHEN A>20
package oops;
class MyException extends Exception{

	int detail;
	MyException(int a){
		detail =a;
	}
	public String toString(){
	
		return "MyException["+detail+"]";
	}
}
public class ownexception {
static void compute(int a) throws MyException{
	System.out.println("Called compute("+a+")");
	if(a>10)
		throw new MyException(a);
	System.out.println("NORMAL EXIT");
}
public static void main(String args[]){
	try{compute(1);
	compute(20);}catch(MyException e){	System.out.println("Caught "+e);}
}
}


//Chained Exception--it is a exception that provides exception associate with another exception
//Exception is use to handle complex programto control errors



