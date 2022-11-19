//Exception- An Exception is a abnormal condition arise in a code sequence at run time .(Run time error)
//Five keywords to handle this exception--try,catch,throw,throws,finally
//try block is used to monitor the exception and catch is to catch  it and handle in rational manner
//finally block after try bkock executed....

//all exception are sublcass of built in class Throwable (top of exception heirarchy)
//there is default exception hadnler which terminate the program and show exception

package oops;

public class exception {
public static void main(String args[]){
	int d=0;
	int a=42/d;
}
}
//it output java.lang.arithmetiception /by zero (see to compile it)