//final is used to declare a const like- final int var;
//final used to apply inheritance
//FINAL TO PREVENT OVERRIDING  if you want that a method should not be override then use final in front of it
package oops;
final class inh{
	//
}
// class  inheritance extends inh{} this is impossible
class fina{
	final void meth(){
		
	}
}
class finall extends fina{
	// void meth(){}  this not accepatable
}
public class finalkeyword {
	

}
// late binding - when java resolves calls to methods dynamically
//final method can not be overriden


// PREVENT CLASS TO BE INHERITED - prevent from overloading or any inheritance property
