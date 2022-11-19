package oops;
class fig{
	double dim1;
	double dim2;
	fig(double a,double b)
	{
		dim1=a;
		dim2=b;
	}
	double area(){
	System.out.println("Wrong dim");
		return 0;	
	}
}
class rectangle extends fig{
	rectangle(double a,double b){
		super(a,b);
	}
	double area(){
		return dim1*dim2;
	}
}
class triangle extends fig{
	triangle(double a,double b){super(a,b);}
	double area(){
		return dim1*dim2/2;
	}
}
public class Runtimepolymorphism {
public static void main(String args[]){
	fig r=new rectangle(2,2);                 //method dispatch
	fig i=new triangle(2,1);
System.out.println(r.area());
System.out.println(i.area());

}
}
