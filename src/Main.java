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
			
			students = readData();
		}
		
		
		in.close();

	}

}
