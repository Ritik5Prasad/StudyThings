//when more then one exception occurs by the single piece of code
package oops;

public class multiplecatchclause {
public static void main(String args[]){
	try{
	int	d=0;
		int a=3/d;
		int arr[]={2};
		arr[42]=99;
	}
	catch(ArithmeticException e){
		System.out.println("Hello"+e);
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Hello"+e);
	}
}
}
