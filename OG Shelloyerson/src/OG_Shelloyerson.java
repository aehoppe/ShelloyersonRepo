
public class Shelloyerson {
	private String name;
	public int gender;
	public int getGender() { return gender; }
	public Shelloyerson (String nameX) {
		this.name = nameX;
	}
	public boolean nameStartsWithD() {
		return name.toLowerCase().startsWith("d");
	}
	public String getName() { return name; }
	public void setName (String name) { this.name = name; }
}
