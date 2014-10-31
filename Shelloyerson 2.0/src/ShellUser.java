
public class ShellUser {
	private String username, password;
	private Shelloyerson[] uShells;
	
	// constructor
	
	/**
	 * creates a new User
	 * 
	 * @param a username
	 */
	public ShellUser(String a){
		uShells = new Shelloyerson[5];
		username = a;
	}

	// mutators
	
	/**
	 * sets the shell of a certain index
	 * 
	 * @param shell shell to place in index
	 * @param idx index to place shell in
	 */
	public void setShell(Shelloyerson shell, int idx) {
		uShells[idx] = shell;
	}
	
	/**
	 * set the password for implicit user
	 * 
	 * @param password string, password eventually to be compared to list of users and passwords
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * set username
	 * 
	 * @param username username string, eventually to be compared to list of users and passwords
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	// accessors

	/**
	 * return array of shelloyersons associated with this user
	 * 
	 * @return the user's array of shelloyersons
	 */
	public Shelloyerson[] getUShells() {
		return uShells;
	}
	
	/**
	 * 
	 */
	public String toString(){
		String userSummary = "User: " + this.username + "\nPets: \n";
		for(int i = 0; i < 4; i++){
			if(this.getShell(i) != null){
				userSummary += "\n" + this.getShell(i) + "\n";
			}
		}
		return userSummary;
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
