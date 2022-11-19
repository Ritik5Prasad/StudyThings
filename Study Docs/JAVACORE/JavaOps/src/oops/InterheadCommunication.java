
//wait() --tells the calling thread to give up the monitor and go tosleep until another thread calls notify()
//notify()--wakes up  a thread that called wait() on the same object
//notifyall()--wakes up all the threads
//these all are declared as final
//producer and consumer

package oops;
class Q{
	int n; 
	boolean valueset=false;
	synchronized int get(){
		if(!valueset)try{
			wait();
		}catch(InterruptedException e){System.out.println("EXCPEITON!!");}
		System.out.println("Got "+n);
valueset=false;
notify();
return n;}

synchronized void put(int n){
	if(valueset)try{wait();}catch(InterruptedException e){System.out.println("EXCEPTION");}
this.n=n; valueset=true;
System.out.println("PUT "+n);
notify();}}
class producer implements Runnable{
	Q q;
	producer(Q q){
	this.q=q;
	new Thread(this,"producer").start();
	}
		public void run(){int i=0; 
		while(true){
			q.put(i++);}}
	}
class consumer implements Runnable{
	Q q;
	consumer(Q q){this.q=q;
	new Thread(this,"consumer").start();}
	
	public void run(){
		while(true){q.get();}
	}
}
public class InterheadCommunication {
public static void main(String args[]){
	Q q=new Q();
	new producer(q);
	new consumer(q);
	System.out.println("CTRL+C");
	
	
}
}
