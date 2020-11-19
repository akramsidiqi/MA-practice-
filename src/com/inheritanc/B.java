package com.inheritanc;

public class B extends A {

	int aptNumber = 300;

	
	void showAdress () {
		System.out.println("B address");
	}

void showAllInfo() {
	
	System.out.println(aptNumber);
	System.out.println(super.aptNumber);
	showAdress();
	super.showAdress();
}


public static void main (String[] args) {
	
	B theB = new B();
	
	theB.showAdress();
	
	theB.showAllInfo();
	
}
}