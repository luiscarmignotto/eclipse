package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many employees will be registered?");
		int n = sc.nextInt();
		int id;
		String name; 
		double salary;
		List<Employee> list = new ArrayList<>();
		
		for(int i  = 0; i < n; i++){
			
			System.out.printf("Employee #%d\n", i+1);
			System.out.println("Id: ");
			id = sc.nextInt();
			System.out.println("Name: ");
			sc.nextLine();
			name = sc.nextLine();
			System.out.println("Salary: ");
			salary = sc.nextDouble();
			System.out.println("\n");
			
			list.add(new Employee(name, id, salary));
		}
		
		for (Employee x : list){
			System.out.println(x);
		}
		
		System.out.println("----------------------------------");
		System.out.println("Search employee by: \n 1.Id \n 2.Name \n 3.Salary ");
		int choice = sc.nextInt();
		List<Employee> result = new ArrayList<>();
		switch(choice){
		case 1:
			System.out.println("Enter employee Id: ");
			id = sc.nextInt();
			
			for (Employee x : list){
				if(x.id == id){
					result.add(x);
				}
			}
			
			System.out.println("\n");
			for (Employee x : result){
				System.out.println(x);
				System.out.println("\n");
			}
		}
		sc.close();

	}

}
