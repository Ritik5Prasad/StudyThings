package Cls;
//SUPER KEYWORD IS USED WHENEVER A SUBCLASS NEEDS TO REFER TO ITS IMMEDIATE SUPERCLASS , 
// SECOND USE LIKE THIS
class a{
	int i;
	
	
}
class b extends a{
	int i; //this i hides the i in a
	b(int a,int b){
		super.i=a;
		       i = b ;                   //this not refers  to the superclass,
	} 

	void show(){
		System.out.print("subclass"+super.i);
		System.out.print("superclass"+i);}
}
public class superkeyword{
	public static void main(String args[]){
		
		b ob=new b(1,2);
		ob.show();
		
	}
	
}