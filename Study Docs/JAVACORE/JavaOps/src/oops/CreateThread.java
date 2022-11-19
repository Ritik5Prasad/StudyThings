//BY RUNNABLE INTERFACE // EXTEND THE INBUILT CLASS THREAD


//IMPLEMENTING INBUILT RUNNABLE INTERFACE
package oops;
class newthread implements Runnable{
	Thread t;
newthread(){                             //constructor of thread
	t=new Thread(this,"Demo");                   //passsing this first arguement indicates that u call the new thread ot run
System.out.println(t);
t.start();                 //start the thread
}

public void run(){
	try{for(int i=5;i>0;i--){
		System.out.println("CT "+i);
		Thread.sleep(500);
	}
		
	}catch(InterruptedException e)
{System.out.println("EXCEPTION FOUND");
		}System.out.println("EXITING CHILD THREAD");}
}
public class CreateThread {
public static void main(String args[]){
	new newthread();
try{for(int i=5;i>0;i--){
	System.out.println("Main Thread "+i);
	Thread.sleep(1000);
}}catch(InterruptedException e){
System.out.println("Main thread ");}System.out.println("Main thread exiting");
}}
