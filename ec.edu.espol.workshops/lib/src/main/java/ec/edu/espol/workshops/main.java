package ec.edu.espol.workshops;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		// Caso de prueba 1
		pruebaCodigo();
		
		// Caso de prueba 2
		pruebaCodigo();
		
		// Caso de prueba 3
		pruebaCodigo();
	}

	private static void pruebaCodigo() {
		Scanner sc = new Scanner(System.in);
		CarInsurance customer = new CarInsurance();
		System.out.println("Por favor ingrese la edad del cliente:");
		int age = sc.nextInt();
		customer.setAge(age);
		System.out.println("Es casado? (true=Si / false=no):");
		boolean isMarried = sc.nextBoolean();
		customer.setMarried(isMarried);
		System.out.println("Es hombre o mujer? (M para hombre y F para mujer):");
		char gender = sc.next().charAt(0);
		customer.setGender(gender);
		System.out.println("Tiene Licencia el cliente? (true=Si / false=no):");
		boolean driving_license = sc.nextBoolean();
		int result = customer.calculatePremium(driving_license);
		if (result > 0) {
			System.out.println("El seguro es de $" + result);
		} else {
			System.out.println("Hubo un problema dado que el resultado es " + result);
		}
		
	}

}
