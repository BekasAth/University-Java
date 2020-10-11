import java.util.ArrayList;

public class Student {
	
	private String name;
	private String id;
	
	private ArrayList<Course> courses = new ArrayList<Course>();
	
	public Student(String aName, String anId) {
		
		name = aName;
		id = anId;
	}
	
		//getters
	
	public String getName() {
		
		return name;
	}
	
	public String getId() {
		
		return id;
	}
	
	
		//setters
	
	public void setName(String name) {
		
		this.name = name; 
	}
	
	public void setid(String id) {
		
		this.id = id;
	}
	
		//add a course at student's course list
	
	public void addCourses(ArrayList<Course> coursesArray) {
		
		courses = coursesArray;
	}
	
		//print student's data
	
	public void printInfo() {
		
		System.out.println("----------------");
		
		System.out.println("Name: " + name + " ID: " + id);
		System.out.println("Attends");
		
		for(int i=0; i<courses.size(); i++) {
			
			System.out.println(i+1 + ") " + courses.get(i).getName() + " (" 
			+ courses.get(i).getPoints() + ")" );
		}
		
		
	}
	

}
