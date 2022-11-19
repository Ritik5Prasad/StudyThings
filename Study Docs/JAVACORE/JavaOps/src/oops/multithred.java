//When two or more thread run concurrently is called MULTITHREADING
//WE CAn use cpu fully by multithreading we can reduce cpu idle time
//Synchronization means to run thread in order 
//messaging to call thread an communication between them

//THE MAIN THREAD PROGRAM
//Whenever java starts up the main thread runs main thread perform shut down actions it is created automatically
//Controlling the main thread
package oops;

public class multithred {
public static void main(String args[])
{
	Thread t= Thread.currentThread();    //main thread priority 5 current thread reference stored in t
	System.out.println(t);
t.setName("My Thread");	
System.out.println(t);
try{
	for(int i=9;i>0;i--){
		System.out.println(i);
		Thread.sleep(1000);               //pausing  the thread for 1000 milliseconnds sleep(long milliseconds,int nanoseconds)
	}
}catch(InterruptedException e){	System.out.println("Main Thread Exception");}
}
}
