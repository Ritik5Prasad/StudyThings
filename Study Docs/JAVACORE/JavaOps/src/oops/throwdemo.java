//throw throwinstance;
//throw is used to declare self exception name 
package oops;
public class throwdemo{
	static void demo(){
		try{
		throw new ArithmeticException("r");  //if arithmerticexception<==>NullPointerException then the 
		}                                                        //type of exception is nullypte
		catch(ArithmeticException e){
			System.out.println("Caught inside "+e);  
			//throw e;      //rethrown uncomment to  see
		}
	}

public static void main(String args[]){
try{
	demo();
	
}		catch(ArithmeticException e){
	System.out.println("reCaugght "+e);
}
}}