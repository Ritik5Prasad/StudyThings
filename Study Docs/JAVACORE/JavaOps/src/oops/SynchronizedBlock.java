//Synchronized Block
package oops;


class Callmee{
	 void call(String msg){    
		System.out.print("["+msg);
	
	try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println();}System.out.println("]");}
	 }
class callerr implements Runnable{
	String msg;
	Callmee target;
	Thread t;
	public callerr(Callmee targ,String s){
		target =targ;
		msg=s;
		t=new Thread(this);
	t.start();	
	}
	public void run(){
	synchronized(target){            //Synchronized Block
		target.call(msg);
	}
}}
class SynchronizedBlock {
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
