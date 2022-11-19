package oops;
class NewThread extends Thread{
	NewThread(){
		super("Demo");	
		 System.out.println(this);
		 start();
}
	public void run(){
		 try{for(int i=5;i>0;i--){
			 System.out.println("CT "+i);
			 Thread.sleep(1000);
		 } }catch(InterruptedException e){System.out.println("ERROR");}
		 System.out.println("EXiting ct "); }
	}
public class extendthread {
public static void main(String args[]){
	new NewThread();
	try{for(int i=5;i>0;i--){System.out.println("MT "+i);Thread.sleep(1500);}}
	catch(InterruptedException e){System.out.println("INTERRUPT ");}
	System.out.println("Exitng mt ");}
}
