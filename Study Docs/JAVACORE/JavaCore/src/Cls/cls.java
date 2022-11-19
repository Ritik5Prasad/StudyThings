
class box{
	double width;
	double Height;
	double area(double width,double Height ){
		return width*Height;
			}
		}
public class Cls {
	public static void main(String args[]){
	
	box b=new box();
	b.width=100;
	b.Height=50;
	double c=b.area(b.width,b.Height);
	System.out.println(c);
	}
	
	

}
