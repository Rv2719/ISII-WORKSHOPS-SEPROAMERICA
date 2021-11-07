package ec.edu.espol.workshops;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import static org.junit.Assert.*;
public class StepsDefs {
 private int actualAnswer;
 private boolean license;
 public CarInsurance carInsurance= new CarInsurance();
 
 
 //escenario 3
 @Given("the age is {int}")
 public void the_age_is(int entero) {
	 carInsurance.setAge(entero);
 }
 @And("the gender is {String}")
 public void the_geneder_is(String m) {
	 carInsurance.setGender(m.charAt(0));
 }
 @And("is his status is {String}")
 public void is_his_status_is(String casada){
	 boolean cas;
	 if(casada.equals("married")) {
		 cas=true;
	 }else {
		 cas=false;
	 }
	 carInsurance.setMarried(cas);
 }
 @And("he {String} license")
 public void he_license(String cadena) {
	 boolean lic;
	 if(cadena.equals("have")) {
		 lic=true;
	 }else {
		 lic=false;
	 }
	 license=lic;
 }
 
 @When("calculate the insurance")
 public void calculated_the_insurance() {
	 actualAnswer=carInsurance.calculatePremium(license);
 }
 
 @Then ("show {int}")
 public void show(int expectedVal) {
	 assertEquals(expectedVal, actualAnswer);
 }
 
}
