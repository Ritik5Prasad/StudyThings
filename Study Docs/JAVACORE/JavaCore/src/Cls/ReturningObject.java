package Cls;
class ret{
	int b;
	ret(int a){ //constructor
		b=a;
	}
	ret incr(){                        //RETURNING OBJECT
		ret temp=new ret(10+b);         //REFERENCING NEW OBJECT
		return temp;                        //RETURN OBJECT
	}
}
public class ReturningObject {
public static void main(String args[])
{
	ret obj1=new ret(2);
	ret obj2;
	obj2=obj1.incr();                    //Passing the Object
	System.out.println(obj2.b);
	obj2=obj2.incr();
	System.out.println(obj2.b);
	System.out.println(obj1.b);
	}
}
