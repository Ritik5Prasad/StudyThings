package accessmodifiers;              // Behaviour of access protection in different packages
class protection2 extends oops.accessprotection{          //subclass protected and public only 
	protection2(){
		// System.out.println(npri); you can check the compilerr error by uncomment
		 System.out.println(npro); 
		 System.out.println(npub);
		 }
}

class p2 {   // Non subclass   only public
p2(){
	oops.accessprotection p=new oops.accessprotection();
	//System.out.println(npro);
	 //System.out.println(p.npro); not visble 
	 System.out.println(p.npub);

	

}}

