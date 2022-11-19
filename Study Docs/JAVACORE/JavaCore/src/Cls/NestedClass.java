package Cls;
class outer{
	static int x=100;
	                                                //OUTER CLASS
	void method(){
		inner obj=new inner();                       //REFERENCING TO INNER CLASS
		obj.display();
	}

 class inner{                            //INNNER CLASS
	void  display(){
		System.out.println(x);
}
}
}//OUTER BRACES CLOSING
public class NestedClass {
public static void main(String args[])

{
	outer t=new outer();
	t.method();
	}
}
