package siyl.cit.model;

public class User {
	private int id;
	private String userName;
	private String nickName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public User(int id, String userName, String nickName) {
		super();
		this.id = id;
		this.userName = userName;
		this.nickName = nickName;
	}
}
