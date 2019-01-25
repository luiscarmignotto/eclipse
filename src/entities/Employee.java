package entities;

public class Employee {
	
	public String name;
	public int id;
	public double salary;
	
	public Employee(){
		
	}
	
	public Employee(String name, int id, double salary){
		this.name = name;
		this. id = id;
		this.salary = salary;
	}
	
	public String toString(){
		return "Id: #" + id + "\n" +
				"Name: " + name + "\n" +
				"Salary: R$" + String.format("%.2f",salary) + "\n";
				
	}
}
