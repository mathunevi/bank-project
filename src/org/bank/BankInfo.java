package org.bank;

public class BankInfo extends AxisBank {
public void saving() {
	System.out.println("saving");
}
public void fixed() {
	System.out.println("fixed"); 
	
}
public void deposit() {
	System.out.println("deposit");
	
}
public static void main(String[] args) {
	BankInfo b=new BankInfo();
	b.saving();
	b.fixed();
	b.deposit();
}

}
