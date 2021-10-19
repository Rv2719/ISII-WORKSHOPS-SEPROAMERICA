package ec.edu.espol.workshops;

public class CarInsurance {
	private int age;
	private char gen;
	private boolean married; //true is married and false isn't
	
	public void setAge(int age) {
		this.age=age;
	}
	public void setGen(char gen) {
		this.gen=gen;
	}
	public void setMarried(boolean married) {
		this.married=married;
	}
	
	public int GetCustomerAge() {
		return this.age;
	}

	public char GetCustomerGender() {
		return this.gen;
	}

	public boolean GetCustomerMaritalStatus() {
		return this.married;
	}
	
}
