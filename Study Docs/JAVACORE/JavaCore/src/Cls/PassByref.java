package Cls;
class ref{
	int a;                //CALL_BY_REFERENCE----CHANGE THE VALUE, IN OTHER THIS DONE BY POINTERS.....
	ref(int c){
	a=c;	
	}
	void change(ref o){  //Passing an Object
		o.a=o.a+2;
	}
}
public class PassByref {
public  static void main(String []args){
	ref o=new ref(15);
	o.change(o);//Passing an Object
	System.out.println(o.a);
}
}
