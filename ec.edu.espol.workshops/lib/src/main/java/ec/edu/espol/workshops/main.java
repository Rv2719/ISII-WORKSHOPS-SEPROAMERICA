package ec.edu.espol.workshops;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		CarInsurance pruebaSeg=new CarInsurance();
		System.out.println("Por favor ingrese la edad del cliente:");
		Scanner leer= new Scanner(System.in);
		int edad=leer.nextInt();
		pruebaSeg.setAge(edad);
		System.out.println("Es casado? (true=Si / false=no):");
		boolean casado= leer.nextBoolean();
		pruebaSeg.setMarried(casado);
		System.out.println("Es hombre o mujer? (M para hombre y F para mujer):");
		char sexo=leer.next().charAt(0);	
		pruebaSeg.setGender(sexo);
		System.out.println("Tiene Licencia el cliente? (true=Si / false=no):");
		boolean licencia=leer.nextBoolean();
		System.out.println(pruebaSeg.calculatePremium(licencia));
		
		
	}

	

}
