import java.util.*;

// 회원관리 핵심 클래스
public class MemberArrayList {
	ArrayList<Member> arrayList; // 멤버변수, 선언만.
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>(); // Member 객체를 저장할 수 있는 리스트 생성 
											 // ★★★ Member의 값은 없지만 (배열)공간만 만들어주는 개념
	}

	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	
	/*
	public boolean removeMember(Member member) {
		arrayList.remove(member);
		return true;
	}
	*/
//★★★★★★★★★★★★★★★★★★★★   (Member member) '객체자체' 즉 '전체내용자체'를 알 수 없기 때문에 또 요소를 하나만 딱 추가하고 삭제할 수 없기때문에 이렇게 안씀
	public boolean removeMember(int memberID) {  //삭제 성공하면 true를 반환하겠다는 목적. "★번호를 적어서 있으면은 삭제하고 없으면 false를 리턴하는 메서드"!!!!!
		// 포장되어 있는 '박스'가 '멤버객체', 내용물에 id와 name이 있음. 멤버로 접근해서 id나 name을 비교해서 그중에 삭제하고자 있는게 있으면 삭제하면 됌.
		// 세개째만에 삭제하고자 하는게 있으면 나머지는 안봐도 돼. 그러면 반복처리 중단.
		// "순차적으로 찾아나가는 느낌"
		for(int i = 0; i < arrayList.size(); i++) {
			Member tmp = arrayList.get(i);     //객체배열을 멤버에 담고 기존 멤버클래스에 필드값이 있으니까 거기서 id번호를 temp id에 담아놓으면 member객체 하나하나에 memberid가 입력됨.
			int tempID = tmp.getMemberID();	  // 그이후 removemember(숫자값)에 넣고 if문을 돌리면 제거하는 방식 (있으면 제거한다.) 
			if(tempID == memberID) {		// >> 더 쉽게 ★★★★ if(tmp.getMemberID == MemberID) {}
				arrayList.remove(i); 	//객체 제거
				
				 // break대신 더 강력하게 탈출
				return true;
				
			}	
		}
		return false;
	}
	
	//추억의 ★ 메소드 오버로딩!!!!★
	// 내가한거
	/*
	public boolean removeMember(String memberName) {  
		for(int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);      
			String tempName = member.getMemberName();
			if(tempName.equals(memberName)) {
				arrayList.remove(i);
				return true;
			}	
		}
		return false;
	}
	*/
	
	// 쌤이한거
	public boolean removeMember(String memberName) { // 삭제 성공하면 true 반환
		boolean chk = false; //일단 실패라고 가정
		for (int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			if(member.getMemberName().equals(memberName)) {
				arrayList.remove(i);
				chk = true; // 삭제성공
				break;
			}
		}
		return chk; //성공일 경우 true, 실패일 경우 false
	}
	
	
	
	
	
	
	public void showAllMember() {
		for /* (로부터 멤버객체 : 리스트성변수) */ (Member member : arrayList) {
			System.out.println(member); 
			// member.toString() 메서드와 동일한 결과
		}
	}
	
	
	
	
}