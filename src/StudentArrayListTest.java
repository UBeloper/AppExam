
public class StudentArrayListTest {

	public static void main(String[] args) {
		StudentArrayList sal = new StudentArrayList();
		Student st1 = new Student(100, "����");
		Student st2 = new Student(101, "�輱��");
		Student st3 = new Student(102, "������");
		Student st4 = new Student(103, "��Ȱ��");
		Student st5 = new Student(104, "��Ű�");
		
		// sal.addStudent(new Student(100, "ȫ�浿"));
		// sal.addStudent(new Student(200, "���浿"));
		// sal.addStudent(new Student(300, "��浿"));
		
		sal.addStudent(st1);
		sal.addStudent(st2);
		sal.addStudent(st3);
		sal.addStudent(st4);
		sal.addStudent(st5);

		System.out.println(sal.removeStudent(100));
		sal.showAllMember();
		
		System.out.println(sal.removeStudent("�輱��"));
		sal.showAllMember();
		
	}

}
