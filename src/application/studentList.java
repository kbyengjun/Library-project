package application;

public class studentList {
	
	private String userId;
	private int java;
	private int db;
	private int security;
	
	public studentList(String userId, int java, int db, int security) {
		this.userId = userId;
		this.java = java;
		this.db = db;
		this.security = security;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getDb() {
		return db;
	}

	public void setDb(int db) {
		this.db = db;
	}

	public int getSecurity() {
		return security;
	}

	public void setSecurity(int security) {
		this.security = security;
	}
}
