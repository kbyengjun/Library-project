package application;

import java.util.ArrayList;
import java.util.List;

/** 
* 회원 정보 클래스
 * 
 * 회원 데이터 추가 방법 : 
 * item.add(new MemberItem("아이디","비밀번호","이름",학번,"학과이름","휴대전화 번호"));	
 */

public class MemberList {
	
	List<MemberItem> item = new ArrayList<MemberItem>();
	
	MemberList(){
		item.add(new MemberItem("test","test","강병준",2019243161,"컴퓨터공학부","010-6668-3173"));		
		item.add(new MemberItem("test2","test2","대일 은가가바 고고",2020243162,"컴퓨터공학부","010-2721-1551"));
		item.add(new MemberItem("test3","test3","김승현",2020243014,"컴퓨터공학부","010-5707-1847"));
		
	}
	
	public List<MemberItem> getCurrentAll() {
		return this.item;
	}
}
