package oops;
//anything decalred public can be accesible anywhere
// private only same class
//protected  in  differebt packages classes and subclasses not in other packages nonsubclasses
//default same package classes

//now we are going to create two packages and many classes in it to understand access protetion 


public class accessprotection
{
int n=1;
private int npri=2;
protected int npro=3;
public int npub=4;

public accessprotection(){
	System.out.println( npri+" "+npro+" "+npub);
}
}
