//isalive is used to know thread is runninf or not   final boolean isAlive()
//join is used to a wait for the thread           final void join() throws InterruptedException


package oops;

class thred implements Runnable{
	Thread t;
	String name;
	thred(String thredname){
	name=thredname;
		t = new Thread(this,name);
System.out.println(t);
	t.start();
	}
	public void run(){
		try{for(int i=5;i>0;i--){System.out.println(name+" "+i); Thread.sleep(1000);}
		}
		catch(InterruptedException e){System.out.println("Exception");}
		}
	}
public class isaliveandjoin {
public static void main(String args[]){
	thred o1=new thred("ONE");
	thred o2=new thred("TWO");
thred o3=new thred("THREE");
System.out.println("t1 "+o1.t.isAlive());
System.out.println("t2 "+o2.t.isAlive() );
System.out.println( "t3 "+o3.t.isAlive());

try{System.out.println("WAit for thred finish");
o1.t.join();
o2.t.join();
o3.t.join();

}
catch(InterruptedException e){System.out.println("Exception");}
System.out.println("t1 "+o1.t.isAlive());
System.out.println("t2 "+o2.t.isAlive() );
System.out.println( "t3 "+o3.t.isAlive());
System.out.println( "MT exited ");

}

}
