//SUBCLASS AND SUPERCLASS HAVE SAME NAME METHOD AND TYPE SIGNATURE 
//THEN SUBCLASS  METHOD IS OVERRIDDEN THE METHOD IN SUPERCLASS
//IT WILL REFRS TO THE SUBCLASS METHOD VERSION AND SUPERCLASS METHOD BECOME HIDDEN...
//if parameter mismatch then it is said to be method ovrload
package oops;
class p{
	int j=4;
	void show(){
		System.out.println("CLass A"+j);
	}
}
class q extends p {
	int i=5;
	void show(){
		super.show();  //super keyword claiing the suprcls method
		System.out.println("Class B "+i);
		
		
	}
}


public class Methodoverriding {
public static void main(String args[]){
	p t=new p();
	q c=new q();
	
	c.show();   //same method name but differnet method calls
	t.show();
	
	
}
}
