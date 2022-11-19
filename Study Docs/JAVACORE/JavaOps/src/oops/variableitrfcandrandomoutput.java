
package oops;
import java.util.Random;
interface sc{
	 
	int NO=0;
	int YES=1;
	int MAYBE=2;
	int LATER=3;
	int NEVER=4;
}

class ques implements sc{
	Random ran=new Random();

	int ask(){
		int prob=(int)(100*ran.nextDouble());
	if(prob<30)return NO;
	else if(prob<60)return YES;
	else if(prob<80)return MAYBE;
	else return NEVER;
	}
}
class variableitrfcandrandomoutput implements sc{
	static void answer(int result)
	{
		switch(result)
		{
		case NO:
			System.out.println("No");
			break;
		case YES:
			System.out.println("Yes");
			break;
		case NEVER:
			System.out.println("Never");
			break;
		case MAYBE:
			System.out.println("Maybe");
			break;
			
		
		}	
			
		}
	
	public static void main(String args[]){
ques q=new ques();
answer(q.ask());
answer(q.ask());answer(q.ask());answer(q.ask());answer(q.ask());	}
}

