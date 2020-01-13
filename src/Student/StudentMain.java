package Student;

import java.util.Scanner;

/**
 *
 * @author Zehao Chen
 */
public class StudentMain {

	public static void main(String[] args) {
		Student[] s = new Student[2];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < s.length; i++) {
			s[i] = new Student();
			System.out.println("Enter id: ");
			s[i].setId(scan.nextInt());
			System.out.println("Enter name: ");
			s[i].setName(scan.next());
			System.out.println("Enter address: ");
			s[i].setAddress(scan.next());
		}
		scan.close();
	}
}
