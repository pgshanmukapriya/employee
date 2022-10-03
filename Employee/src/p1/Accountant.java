package p1;

public class Accountant extends Employee{
private	String filename;

public Accountant() {
	super();
}
public Accountant(String filename) {
	super();
	this.filename=filename;
}

public String getFilename() {
	return filename;
}

public void setFilename(String filename) {
	this.filename = filename;
}
	
public void worksonTaxFile() {
	System.out.println("name of the employee    +super.name");
	System.out.println("salary of the employee    +super.salary");
	System.out.println("filename the employee is working     +super.filename");


		
	}

}
