import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		ArrayList<Student> students = new ArrayList<Student>();

		
		System.out.println("Do yout want to enter the data manually or a random example?");
		System.out.println("1 (Manually) - 2 (Random)");
		int ans = in.nextInt();
		
		in.nextLine();
		
		if(ans == 1) {
			
			students = DataEntry.readData();
			
			for(int i=0; i<students.size(); i++) {
				
				students.get(i).printInfo();
			}
		}else {
			
			System.out.println("----Random Examples----");
			
			Course c1 = new Course("course 1", 5);
			Course c2 = new Course("course 2", 6);
			Course c3 = new Course("course 3", 7);
			Course c4 = new Course("course 4", 8);
			
			Student s1 = new Student("student 1","dai 1");
			s1.addCourse(c2);
			s1.addCourse(c4);
			students.add(s1);
			
			
			GraduateStudent s2 = new GraduateStudent("student 2", "dai 2","supervisor 1");
			s2.addCourse(c3);
			s2.addCourse(c2);
			students.add(s2);
			
			Student s3 = new Student("student 3","dai 3");
			students.add(s3);
		
			Student s4 = new Student("student 4","dai 4");
			s4.addCourse(c1);
			students.add(s4);
			
			GraduateStudent s5 = new GraduateStudent("student 5", "dai 5","supervisor 2");
			s5.addCourse(c1);
			students.add(s5);
			
			for(int i=0; i<students.size(); i++) {
				
				students.get(i).printInfo();
			}
		}
		
		
		in.close();

	}

}
