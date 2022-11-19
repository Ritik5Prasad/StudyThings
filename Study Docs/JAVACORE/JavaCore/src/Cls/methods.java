//Methods,Constructor,this Keyword

package Cls;
class box{
	double width;
	double Height;
	void setdim(double w,double h){
		width=w;
		Height=h;
	}
	double area(double width,double Height){
		return width*Height;
	}
}
public class methods {
	public static void main(String args[]){
	
	box b=new box();
	b.setdim(10, 30);
	double c=b.area(b.width,b.Height);
	System.out.println(c);
	}
}
	
