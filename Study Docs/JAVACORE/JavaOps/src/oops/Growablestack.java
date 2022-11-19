package oops;
interface intstck{
	void push(int item);
	int pop();
}
class dynstack implements intstck{
	private int stck[];
	private int tos;
	dynstack(int size){
		stck=new int[size];
		tos=-1;}
	
	public void push(int item){
		if(tos==stck.length-1){
			int temp[]=new int [stck.length*2];       //doublic size
			for(int i=0;i<stck.length;i++){temp[i]=stck[i];}    //all data giving in doubled temp 
			
			stck=temp;                //  temp is assigned as previous stack
			stck[++tos]=item;}
			else stck[++tos]=item;
		}
	
	public int pop(){
		if(tos<0)
			return 0;
		else return stck[tos--];
	}
}

public class Growablestack {

public static void main(String args[])
{
	dynstack s1=new dynstack(5);               // size is only five but still we got 12 array stack growable stack
	for(int i=1;i<=12;i++ )s1.push(i);
	for(int i=1;i<=12;i++)System.out.println(s1.pop());	
}}