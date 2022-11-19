package oops;
class nest{
	static void nesttry(int a){
		try{    //nested try
		if(a==1) a=a/(a-a);
		if(a==2)
		{int c[]={1};c[42]=99;}
	
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println(e);
	}
	}
}
public class nestedtry {
public static void main(String args[]){
	try{
		int a=args.length;
		int b=42/a;
		System.out.println(a);
	
}  catch(ArithmeticException e){
	System.out.println(e);n
	nesttry(a);
}}
