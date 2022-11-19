package oops;
interface e{
	void meth1();
	void meth2();
	
}
interface v extends e{
	void meth3();

}


class myclass implements v{
	public void meth1(){
		System.out.println("meth1");
	}
public void meth2(){
	System.out.println("meth2");		
	}public void meth3(){
		System.out.println("meth3");
	}
}
public class interfaceextended {
public static void main(String args[]){
	myclass r=new myclass();
	r.meth1();
	r.meth2();
	r.meth3();
}
}
