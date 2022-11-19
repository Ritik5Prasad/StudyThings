package Cls;
class stc{
	int stck[]=new int [10];
	int top;
	stc(){
		top=-1;
		
	}
	void push(int item){
		if(top==9)
			System.out.println("Full");
		else
			stck[++top]=item;
	}	
	int pop(){
		if(top<0){
			return 0;}
			else{
				return stck[top--];
			}
		}
	}      
	
	
public class Stack {
	public static void main(String args[]){
		stc s=new stc();
		s.push(4);
		s.push(5);
		
		System.out.println(s.pop());
		System.out.println(s.pop());
	}

}
