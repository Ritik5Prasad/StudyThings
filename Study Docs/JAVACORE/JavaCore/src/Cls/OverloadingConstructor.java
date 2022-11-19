package Cls;
class ovrld{
	int a; int b;
	//IN THIS A CONSTRUCTOR IS WITH TWO PARAMETER AND ANOTHER ONE WITH NO PARAMETER
	//HENCE THEY ARE CONSTRUCTING WITH SAME CONSTRUCTOR NAME,SO
	//THEY ARE OVERLOADED----
	ovrld(int a,int b){
		 this.a=a; this.b=5;  // BEST USE OF "this" Keyword
	}
	ovrld(){   // constructor overloaded..
	a=-1;b=-1;	
	}
	int add(){
		return a+b;
	}
}
public class OverloadingConstructor {
public static void main(String args[]){
ovrld c=new ovrld(4,5);
ovrld s=new ovrld();

System.out.println(c.add());
System.out.println(s.add());

}
}
