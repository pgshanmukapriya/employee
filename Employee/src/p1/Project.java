package p1;

public class Project extends Developer {
	private String projectName;
	private int allocatedays;
	
	public Project() {
		super();
	}
	public Project(String projectName, int allocatedays) {
		super();
		this.projectName=projectName;
		this.allocatedays=allocatedays;
		
	}
	
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public int getAllocatedays() {
		return allocatedays;
	}
	public void setAllocatedays(int allocatedays) {
		this.allocatedays = allocatedays;
	}
	

}
