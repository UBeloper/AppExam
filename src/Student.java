
public class Student {
	private int studentID;
	String studentName;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}
	
	public Student(String studentName) {
		this.studentName = studentName;
	}
	
	
	// �� ���� �Ȳ�����...............................
	@Override
	public boolean equals(Object obj) {
		Student std = (Student)obj; // Student ��ü�� �����ؾ� �ϱ� ������ ĳ���� �ʿ�. ????????
		if (std.studentID == this.studentID && std.studentName.equals(studentName)) {
			return true;			
		} else {
			return false;
		}
	}
	//****����****** ���ڿ��񱳴� equals�� ���.
}
