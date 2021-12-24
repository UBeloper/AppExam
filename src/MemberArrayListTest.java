
public class MemberArrayListTest {
	public static void main(String[] args) {
		MemberArrayList memList = new MemberArrayList();
		Member m1 = new Member(100, "홍길동");
		Member m2 = new Member(200, "동길홍");
		Member m3 = new Member(300, "길홍동");
		Member m4 = new Member(400, "홍동길");
		Member m5 = new Member(500, "동홍길");
		
		memList.addMember(m1);
		memList.addMember(m2);
		memList.addMember(m3);
		memList.addMember(m4);
		memList.addMember(m5);
		
		memList.showAllMember();
		
		memList.removeMember(300);
		
		memList.showAllMember();
		
		memList.removeMember(600);
		
		if (memList.removeMember(300) == true) {
			System.out.println("삭제 돼요");
		} else {
			System.out.println("삭제 안돼요");
		}
		
		System.out.println(memList.removeMember(300));
		
		// 메소드 오버로딩 이용 - 이름으로 삭제
		if(memList.removeMember("홍동동") == true) {
			System.out.println("삭제 돼요");
		} else {
			System.out.println("삭제 안돼요");
		};
		
		System.out.println(memList.removeMember("홍동동"));
		System.out.println(memList.removeMember("홍길동"));
		
		
		
	}
}
