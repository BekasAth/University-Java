import java.util.ArrayList;
import java.util.Scanner;

public class DataEntry {
	
	
	
	
	public DataEntry() {
		
	}
	
		//method for enter the data from user
	
	public static ArrayList<Student> readData() {
		
		Scanner in = new Scanner(System.in);
		
		boolean more = true;
		boolean coursesMore = true;
		
		ArrayList<Student> students = new ArrayList<Student>();
		ArrayList<Course> courses = new ArrayList<Course>();
		
		while(more) {
			
			System.out.println("Enter Student's Info:");
			System.out.println("Name: ");
			String name = in.nextLine();
			
			System.out.println("ID: ");
			String id = in.nextLine();
			
			
			
			
			System.out.println("Does the student attend any course?");
			System.out.println("1 (Yes) - 2 (No)");
			int ans = in.nextInt();
			
			in.nextLine();
			
			if(ans == 1) {
				
				

				System.out.println("Enter the courses:");
			
				while(coursesMore) {
				
					System.out.println("Course name: ");
					String courseName = in.nextLine();
				
					System.out.println("Course points: ");
					int coursePoints = in.nextInt();
					
					in.nextLine();
				
					Course aCourse = new Course(courseName, coursePoints);
					 
					courses.add(aCourse); 
					
					System.out.println("More Courses?  1 (Yes) - 2 (No)");
					ans = in.nextInt();
					
					if(ans != 1) 
						coursesMore = false;
					
					in.nextLine();
				}
			}
			
			System.out.println("Graduate Student?    1 (Yes) - 2 (No)");
			ans = in.nextInt();
			
			in.nextLine();
			
			if(ans == 1) {
				
				 System.out.println("Supervisor: ");
				 String supervisor = in.nextLine();
				 
				 GraduateStudent aStudent = new GraduateStudent(name, id, supervisor);
				 aStudent.addCourses(courses);
				 students.add(aStudent);
				 
			}else {
				
				 Student aStudent = new Student(name, id);
				 aStudent.addCourses(courses);
				 students.add(aStudent);
			}
			
			System.out.println("More Students?  1 (Yes) - 2 (No)");
			ans = in.nextInt();
			
			if(ans != 1) 
				more = false;
			
			in.nextLine();		
		}
		
		return students;
		
	}
	
	
}
