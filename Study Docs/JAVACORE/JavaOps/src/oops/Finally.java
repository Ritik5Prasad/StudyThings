//finally executes aftertry andcatch block
//this is optional
package oops;
public class Finally {
static void demo(){
	try{
		System.out.println("inside demo ");
throw new RuntimeException("de");
	}
	finally{
		System.out.println("final o ");
	}
}public static void main(String args[]){
	try{
		demo();
	}catch(Exception e){
		System.out.println("caught ");  //simply to understand that finally block execute after the try and block jahe jo kar lo
	}
}
	
}
