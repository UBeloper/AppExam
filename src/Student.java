
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
	
	
	// 이 문장 안꽂힌다...............................
	@Override
	public boolean equals(Object obj) {
		Student std = (Student)obj; // Student 객체로 저장해야 하기 때문에 캐스팅 필요. ????????
		if (std.studentID == this.studentID && std.studentName.equals(studentName)) {
			return true;			
		} else {
			return false;
		}
	}
	//****정리****** 문자열비교는 equals를 써라.
}
