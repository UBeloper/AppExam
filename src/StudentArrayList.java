import java.util.*;

public class StudentArrayList {
	// ������� ����
	ArrayList<Student> arraylist;

	// ������ - ��ü �����ϸ� ARRAYLIST ������ ����Բ�
	public StudentArrayList() {
		this.arraylist = new ArrayList<Student>();
	}
	
	// Student �߰�
	public void addStudent(Student student) {
		this.arraylist.add(student);
	}
	
	// Student(�л�) ID�� ���� / �̸����� ����
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
