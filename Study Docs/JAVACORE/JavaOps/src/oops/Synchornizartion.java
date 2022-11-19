//When two or more threads need accces to shared resource they need some way to ensure that one thread use the resource
//at one time this done by Synchronization
//Monitor (Semaphore)only one thread pass into it and other is suspended when this thread exit then other comes into it

//SYNCHRONIAZATION

package oops;
class Callme{
	synchronized void call(String msg){             //just add synchronized word
		System.out.print("["+msg);
	
	try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println();}System.out.println("]");}
}
class caller implements Runnable{
	String msg;
	Callme target;
	Thread t;
	public caller(Callme targ,String s){
		target =targ;
		msg=s;
		t=new Thread(this);
	t.start();	
	}
	public void run(){
		target.call(msg);
	}
}
public class Synchornizartion {
public static void main(String args[]){
	Callme target=new Callme();
	caller o1=new caller(target,"Hello");
	caller o2=new caller(target,"Synchronized");
	caller o3=new caller(target,"Ritik");
	try{o1.t.join(); 
	o2.t.join(); 
	o3.t.join();}
	catch(InterruptedException e){System.out.println("EXCEPTION");}

}
}
