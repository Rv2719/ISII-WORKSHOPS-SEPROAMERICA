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
	
	public int getAge() { //Method to obtain the customer's age
		return this.age;
	}

	public char getGender() { //Method to obtain the customer's gender
		return this.gender;
	}

	public boolean getMarried() { //Method to obtain the client's marital status
		return this.married;
	}
	/*
	* Method that calculates the premium of a car insurance
    * @param licencia boolean variable
    * @return result integer variable
	*/
	public int calculatePremium(boolean licencia) { 
		if(!licencia || this.getAge()>80 || (this.getGender()!='M' && this.getGender()!='F') || this.getAge()>0) {
			return -1;
		}
		int result= 500;
		if(this.age<25 && this.married==false && this.gender=='M') {
			result+=1500;
		}
		if(this.married==true || this.gender=='F') {
			result-=200;
		}
		if(this.age>=45 && this.age<65) {
			result-=100;
		}
		return result;
	}
	
}

