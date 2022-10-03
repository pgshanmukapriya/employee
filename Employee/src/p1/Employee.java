package p1;

public class Employee {
private	String name;
private	int Salary;	

public void login(int name) {
	System.out.println("enter the name of the user");
	
}
public Employee() {
	super();
}
public Employee(String name,int Salary) {
	super();
	this.name=name;
	this.Salary=Salary;
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getSalary() {
	return Salary;
}

public void setSalary(int salary) {
	Salary = salary;
}

	
}
