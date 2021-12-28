
public class StudentArrayListTest {

	public static void main(String[] args) {
		StudentArrayList sal = new StudentArrayList();
		Student st1 = new Student(100, "±è»ç¿ë");
		Student st2 = new Student(101, "±è¼±¾ð");
		Student st3 = new Student(102, "±èÁ¸Àç");
		Student st4 = new Student(103, "±èÈ°¿ë");
		Student st5 = new Student(104, "±è¸Å°³");
		
		// sal.addStudent(new Student(100, "È«±æµ¿"));
		// sal.addStudent(new Student(200, "°­±æµ¿"));
		// sal.addStudent(new Student(300, "±è±æµ¿"));
		
		sal.addStudent(st1);
		sal.addStudent(st2);
		sal.addStudent(st3);
		sal.addStudent(st4);
		sal.addStudent(st5);

		System.out.println(sal.removeStudent(100));
		sal.showAllMember();
		
		System.out.println(sal.removeStudent("±è¼±¾ð"));
		sal.showAllMember();
		
	}

}
