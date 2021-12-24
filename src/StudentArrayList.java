import java.util.*;

public class StudentArrayList {
	// 멤버변수 선언
	ArrayList<Student> arraylist;

	// 생성자 - 객체 생성하면 ARRAYLIST 공간이 생기게끔
	public StudentArrayList() {
		this.arraylist = new ArrayList<Student>();
	}
	
	// Student 추가
	public void addStudent(Student student) {
		this.arraylist.add(student);
	}
	
	// Student(학생) ID로 삭제 / 이름으로 삭제
	public boolean removeStudent(int studentID) {
		boolean chk = false;
		for(int i = 0; i < arraylist.size(); i++) {
			Student student = arraylist.get(i);
			if (student.getStudentID() == studentID) {
				arraylist.remove(i);
				chk = true;
				break;
			} 
		}
		return chk;
	}
	
	public boolean removeStudent(String studentName) {
		boolean chk = false;
		for(int i = 0; i < arraylist.size(); i++) {
			Student student = arraylist.get(i);
			if(student.getStudentName().equals(studentName)) {
				arraylist.remove(i);
				chk = true;
				break;
			}
		}
		return chk;
	}
	
	
	
	
	public void showAllMember() {
		for ( Student student : arraylist) {
//			System.out.println(student.getStudentID() + " : " + student.getStudentName());
			System.out.println(student);
		}
	}
	

}
