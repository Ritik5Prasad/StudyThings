//vararsg=> VARIABLE LENGTH ARGUEMENTS
package Cls;
class vrgs{
	static void test(int ... v  ){
		System.out.println(v.length);
for(int x:v)System.out.println(x);
	}
}
public class Varargs {
	
public static void main(String args[])
{
	test(1,2,3);
	test();
	test(2,32,32,3);
}

	
}

