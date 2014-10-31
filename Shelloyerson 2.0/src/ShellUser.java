
public class ShellUser {
	private String username, password;
	private Shelloyerson[] uShells;
	
	// constructor
	public ShellUser(String a){
		uShells = new Shelloyerson[5];
		username = a;
	}

	// mutators
	
	public void setShell(Shelloyerson shell, int idx) {
		uShells[idx] = shell;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	// accessors

	public Shelloyerson[] getUShells() {
		return uShells;
	}
	
	public String toString(){
		return username;
	}

	public Shelloyerson getShell(int idx){
		return uShells[idx];
	}

	public String getPassword() {
		return password;
	}

	public String getUsername() {
		return username;
	}

}
