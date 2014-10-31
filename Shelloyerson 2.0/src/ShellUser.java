
public class ShellUser {
	private String username, password;
	private Shelloyerson[] uShells;
	
	public ShellUser(String a){
		uShells = new Shelloyerson[5];
		username = a;
	}

	public Shelloyerson[] getUShells() {
		return uShells;
	}

	public void setUShells(Shelloyerson[] uShells) {
		this.uShells = uShells;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String toString(){
		return username;
	}
}
