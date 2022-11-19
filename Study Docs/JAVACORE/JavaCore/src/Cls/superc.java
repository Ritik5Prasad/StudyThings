package Cls;
class Box{
private	double weight ,height ,depth;
	Box(Box ob){
		weight=ob.weight;
		height=ob.height;
		depth=ob.depth;
	}
	Box(double w,double h,double d){
		weight=w;
		height=h;
		depth=d;
	}
}
class boxc extends Box{
	double width;
	boxc(boxc ob){
		super(ob);
		width=ob.width;
	}
}
public class superc {
public static void main(String args[]){
		boxc c = new boxc(10,21); 
		
		
}
}
