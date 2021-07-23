package application;

import java.util.Locale;
import java.util.Scanner;

import entities.employee;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		employee employee = new employee();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Emplouee: " + employee);
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble(); 
		employee.increaseSalary(percentage);
		
		System.out.println();
		System.out.print("Updated data: " + employee);
		
		
		sc.close();
	}

}
