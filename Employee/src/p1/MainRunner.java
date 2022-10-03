package p1;
import p1.Accountant;
import p1.Developer;

public class MainRunner {
	
	public static void main(String[] args) {
     Accountant accountant=new Accountant();
     accountant.setName("Ramesh");
     accountant.setSalary(2000);
     accountant.setFilename("tax file");
     System.out.println(accountant.getName());
     System.out.println(accountant.getSalary());
     System.out.println(accountant.getFilename());
     
     Developer developer=new Developer();
     developer.setName("John");
     developer.setSalary(3000);
     developer.setProjectName("Instagram");
     System.out.println(developer.getName());
     System.out.println(developer.getSalary());
     System.out.println(developer.getProjectName());
     
}
}
