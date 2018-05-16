
public class User {

	private String userName;
	private String passwd;
	public static String Country;

	public User() {

	}

	public User(String userName, String passwd) {
		this.userName = userName;
		this.passwd = passwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public static String getCountry() {
		return Country;
	}

	public static void setCountry(String country) {
		Country = country;
	}

	@Override
	public String toString() {
		return this.userName + " " + this.passwd;
	}

}
