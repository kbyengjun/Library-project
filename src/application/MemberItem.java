package application;

/**
 * 회원 정보 다루는 클래스임.
 */
public class MemberItem {
	
	private String userId;
	private String userPw;
	private String userName;
	private int studentNumber;
	private String departmentName;
	private String phoneNumber;
	
	public MemberItem(String userId, String userPw,String userName, int studentNumber,
			String departmentName, String phoneNumber){
		
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		this.studentNumber = studentNumber;
		this.departmentName = departmentName;
		this.phoneNumber = phoneNumber;
		
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
