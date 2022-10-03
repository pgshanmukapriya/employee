package p1;

public class Developer extends Employee {
	private String  projectName;
	private String clinetName;
	
	public Developer() {
		super();
	}
	public Developer(String projectname,String clinetName) {
		super();
		this.projectName=projectname;
		this.clinetName=clinetName;
	}
	
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getClinetName() {
		return clinetName;
	}
	public void setClinetName(String clinetName) {
		this.clinetName = clinetName;
	}
	
public void worksonproject() {
	System.out.println("name:    +super.name");
	System.out.println("salary:  +super.salary");
	System.out.println("projectname:   +super.projectname");
}

}
