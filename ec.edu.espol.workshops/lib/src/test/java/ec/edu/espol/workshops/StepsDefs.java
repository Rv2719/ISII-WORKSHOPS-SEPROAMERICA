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
 @Given("The age is 21 ")
 public void the_age_is_21() {
	 carInsurance.setAge(21);
 }
 @And("The gender is M")
 public void the_geneder_is_M() {
	 carInsurance.setGender('M');
 }
 @And("is his status is not married")
 public void his_status_is_not_married(){
	 carInsurance.setMarried(false);
 }
 @And("he not have license")
 public void dont_hace_lecense() {
	 license=false;
 }
 
 @When("calculate the insurance")
 public void calculated_the_insurance() {
	 actualAnswer=carInsurance.calculatePremium(license);
 }
 
 @Then ("show 2000")
 public void show() {
	 assertEquals(0, actualAnswer);
 }
}
