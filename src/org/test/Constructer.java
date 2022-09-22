package org.test;

public class Constructer  extends AbstractFinal {
	
public Constructer(int id){
	System.out.println("Employee id is :"+id);
}
 
public Constructer() {
	super.bankName();
	super.deposite();
	super.saving();
	super.honda();
	super.empPhone();
	super.collageName();
	super.add();
	 System.out.println("Emplaye name is :  abbas ");

}
public static void main(String[] args) {
	
	Constructer c = new Constructer(12345);
	Constructer c1 = new Constructer();
}


}