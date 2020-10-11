
public class GraduateStudent extends Student {
	
	private String supervisor;
	
	public GraduateStudent(String name, String id, String aSupervisor) {
		
		super(name,id);
		supervisor = aSupervisor;
	}
	
	
	public void printInfo() {
		
		super.printInfo();
		System.out.println("Supervisor: " + supervisor);
	}
	

}
