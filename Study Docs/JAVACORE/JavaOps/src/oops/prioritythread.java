//Thread priorities is used by the thread schedular to decided when each thread should be allowed to run
//Higher priority gets more cpu time than lower priority
//MIN-PRIOTIY=1 MAX_PRIORITY=10 NORM+PRIORITY=5 default//
//PRIORITY SET
package oops;
class clicker implements Runnable{
	int click=0;
	Thread t;
	private volatile boolean running=true;
	public clicker(int p){
		t=new Thread(this);
		t.setPriority(p);
	}
	public void run(){
		while(running){click++;}
	}
	public void stop(){
		running=false;
	}
		public void start(){
			t.start();
	}
}
public class prioritythread {
public static void main(String args[])
{
	Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
clicker hi=new clicker(Thread.NORM_PRIORITY+2);
clicker lo=new clicker (Thread.MIN_PRIORITY);
hi.start();
lo.start();
try{Thread.sleep(1000);}catch(InterruptedException e){
	System.out.println("EXCPETION!!");
}
lo.stop();
hi.stop();
try{hi.t.join();
lo.t.join();
}
catch(InterruptedException e){System.out.println("EXCEPTION!!!");}
System.out.println(lo.click);
System.out.println(hi.click);}

}