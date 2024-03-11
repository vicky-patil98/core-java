package com.learning.core.day1;
interface MedicineInfo {
	
	void displayLabel();
}
class Ointment implements MedicineInfo{

	public void displayLabel() {
		// TODO Auto-generated method stub
		System.out.println("Ointment is for external use only");
	}

}

class Syrup implements MedicineInfo{

	public void displayLabel() {
		// TODO Auto-generated method stub
		System.out.println("Syrup is consumable only on prescription");
	}

}

class Tablet implements MedicineInfo{
	public void displayLabel() {
		// TODO Auto-generated method stub
		System.out.println("Store Tablet in cool dry places");
		
	}
}

public class D01P02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tablet t1 = new Tablet();
		Syrup s1 = new Syrup();
		Ointment o1 = new Ointment();
		t1.displayLabel();
		s1.displayLabel();
		o1.displayLabel();
	}

}
