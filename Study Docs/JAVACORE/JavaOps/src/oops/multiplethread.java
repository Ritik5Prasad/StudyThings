package oops;
class multithread implements Runnable{
	String name;
	Thread t;
	multithread(String threadname){
		name=threadname;
		t=new Thread(this,name);
		System.out.println(t);
		t.start();
	}
	public void run(){
		try{for(int i=5;i>0;i--)
		{System.out.println(name+" "+i);Thread.sleep(1000);}
		}catch(InterruptedException e){System.out.println("EXCEPTION");}
		System.out.println(name+" Thread Exited");
	}
}
public class multiplethread {
public static void main(String args[]){

	new multithread("one");
	new multithread("Two");
	new multithread("Three");
try{for(int i=5;i>0;i--){
	System.out.println("MT "+i);Thread.sleep(2000);}}catch(InterruptedException e){System.out.println("MT ");}
System.out.println("MT EXITED");
}
}

