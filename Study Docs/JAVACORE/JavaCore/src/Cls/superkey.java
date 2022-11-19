//TWO USES- CALLS THE SUPERCLASS CONSTRUCTOR ,ACCESS THE MEMBER OF SUPERCLASS
//SYNTAX -- super(parameter list);

package Cls;
class Box{
	double w,h,d; 
	Box(double w,double h, double d){
		this.w=w;
		this.h=h;                                         //this keyword best use
		this.d=d;
	}

}
class Boxcolor extends Box{
	int color;
	Boxcolor(double w,double h,double d,int c){
		super(w,h,d);            // SUPER KEYWORD ACCESING THE SUPERCLASS ELEMENTS SUPERCLASS CONSTRUCTORS
		color=c;                 //SUPER IS THE FIRTS STATEMENT THAT EXECUTES IN THE SUBLASS
	}
}
public class superkey{
	public static void main(String args[]){
		Boxcolor r=new Boxcolor(22,23,2,323);
		
		 System.out.println(r.w+r.h+r.d);
			}
	}
