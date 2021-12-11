package ec.edu.espol.workshops;
/*
* Calculating a car insurance premium
* @author  Raúl Villao
* @author  Paúl Bustos
* @author  Mary Silvestre
* @version 1.0
* @since   2021-10-22
*/
public class CarInsurance {
	//Class with private attributes
	private int age; // Private field age of type integer
	private char gender;// Gender private field of type char with values ​​'M' or 'F'
	private boolean married; //Private field of type boolean, true is married and false isn't
	
	public void setAge(int age) {
		this.age=age;
	}
	public void setGender(char gender) {
		this.gender=gender;
	}
	public void setMarried(boolean married) {
		this.married=married;
	}
	
	public int getCustomerAge() {
		return this.age;
	}

	public char getCustomerGender() {
		return this.gender;
	}

	public boolean getCustomerMaritalStatus() {
		return this.married;
	}
  public int calculatePremium(boolean licencia) { //licencia true, we can sell the insurance else not
    if (!licencia || this.age > 80 || (this.getCustomerGender() != 'M' 
        && this.getCustomerGender() != 'F') || this.getCustomerAge() < 0) {
      return -1;
    }
    int result = 600;
    if (this.age < 25 && this.married == false && this.gender == 'M') {
      result += 1500;
    }
    if (this.married == true || this.gender == 'F') {
      result -= 200;
    }
    if (this.age >= 45 && this.age < 65) {
      result -= 100;
    }
    return result ;
  }
	
}

