package Cls;

class arg{
	
	void add(int a,int b)   // PASS BY VALUE ----- ONLY USING  THE COPIED VALUE, IT DOESN'T CHANGE THE ORIGINAL VALUE
	{
	a=a*2;
	b=b*2;
	}

	
}

public class PassByvalue{
public static void main(String []args){

	arg c=new arg();
	int a=20;
	int b=30;
	c.add(a,b);
	
System.out.println(a+" "+b); // VALUE DOESNT CHANGE

}
}
