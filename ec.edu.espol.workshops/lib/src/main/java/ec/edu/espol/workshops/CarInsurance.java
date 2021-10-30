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
	
	public int getCustomerAge() {
		return this.age;
	}

	public char getCustomerGender() {
		return this.gen;
	}

	public boolean getCustomerMaritalStatus() {
		return this.married;
	}
  public int calculatePremium(boolean licencia) { //licencia true, we can sell the insurance else not
    if (!licencia || this.age > 80 || (this.getCustomerGender() != 'M' 
        && this.getCustomerGender() != 'F') || this.getCustomerAge() > 0) {
      return -1;
    }
    int result = 500;
    if (this.age < 25 && this.married == false && this.gen == 'M') {
      result += 1500;
    }
    if (this.married == true || this.gen == 'F') {
      result -= 200;
    }
    if (this.age >= 45 && this.age < 65) {
      result -= 100;
    }
    return result;
  }
	
}

