package org.test;

public class AbstractFinal extends Abstract3 implements Address, Collage, Phone, Vehicale
{

	@Override
	public void bankName() {
		System.out.println("SBI");

	}

	@Override
	public void deposite() {
		System.out.println("20000");

	}

	@Override
	public void saving() {
		System.out.println("30000");

	}

	@Override
	public void honda() {
		System.out.println("herohonda");

	}

	@Override
	public void empPhone() {
		System.out.println("iphone");

	}

	@Override
	public void collageName() {
		System.out.println("urumu dhanalakshimi collage");

	}

	@Override
	public void add() {
		System.out.println("TRICHY");

	}

	public static void main(String[] args) {
		AbstractFinal a = new AbstractFinal();
		a.bankName();
		a.deposite();
		a.saving();
		a.add();
		a.honda();
		a.collageName();
		a.empPhone();
	}

}
