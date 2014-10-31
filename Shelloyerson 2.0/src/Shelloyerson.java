public class Shelloyerson {
    // characteristics
    private boolean isMale;
    private int strength, speed, looks, dance, sing, smarts;
    private String name, gender;
    
    public static int shelloyersonCount;
    //constructors:
    /**
     * constructs a new shelloyerson without a name, assigns all random attributes
     */
    public Shelloyerson(){
        if (Math.random() < 0.5){
            isMale = true;
            gender = "male";
        }
        else {
            isMale = false;
            gender = "female";
        }
        strength = (int) (Math.random() * 10) + 1;
        speed = (int) (Math.random() * 10) + 1;
        looks = (int) (Math.random() * 10) + 1;
        dance = (int) (Math.random() * 10) + 1;
        sing = (int) (Math.random() * 10) + 1;
        smarts = (int) (Math.random() * 10) + 1;
    }
    
    /**
     * constructs a new shelloyerson with a name, assigns all random attributes
     * @param newName name of shelloyerson
     */
    public Shelloyerson(String newName){
        name = newName;
        if (Math.random() < 0.5){
            isMale = true;
            gender = "male";
        }
        else {
            isMale = false;
            gender = "female";
        }
        strength = (int) (Math.random() * 10) + 1;
        speed = (int) (Math.random() * 10) + 1;
        looks = (int) (Math.random() * 10) + 1;
        dance = (int) (Math.random() * 10) + 1;
        sing = (int) (Math.random() * 10) + 1;
        smarts = (int) (Math.random() * 10) + 1;
    }
    
    // accessors
    
    /**
     * gender testing
     * 
     * @return whether it is male or not
     */
    public boolean isMale() {
        return isMale;
    }

    /**
     * returns strength
     * 
     * @return strength value
     */
    public int getStrength() {
        return strength;
    }

    /**
     * returns speed
     * 
     * @return speed value
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * returns looks attribute
     * 
     * @return looks value
     */
    public int getLooks() {
        return looks;
    }

    /**
     * returns dance attribute
     * 
     * @return dance value
     */
    public int getDance() {
        return dance;
    }

    /**
     * returns sing attribute
     * 
     * @return sing value
     */
    public int getSing() {
        return sing;
    }

    /**
     * returns smarts attribute
     * 
     * @return smarts value
     */
    public int getSmarts() {
        return smarts;
    }
    
    /**
     * return name attribute
     * 
     * @return name
     */
    public String getName(){
        return name;
    }
    
    /**
     * returns gender
     * 
     * @return gender, male or female
     */
    public String getGender(){
        return gender;
    }

    //mutators
    
    /**
     * sets strength attribute
     * 
     * @param strength strength value
     */
    public void setStrength(int strength) {
        this.strength = strength;
    }

    /**
     * sets speed attribute
     * 
     * @param speed speed value
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * sets the looks attribute, beautiful
     * 
     * @param looks looks value
     */
    public void setLooks(int looks) {
        this.looks = looks;
    }

    /**
     * sets the dance value
     * 
     * @param dance dance value, or how many left feet
     */
    public void setDance(int dance) {
        this.dance = dance;
    }

    /**
     * sets the sing value
     * 
     * @param sing sing value
     */
    public void setSing(int sing) {
        this.sing = sing;
    }

    /**
     * sets the smarts attribute
     * 
     * @param smarts smarts value
     */
    public void setSmarts(int smarts) {
        this.smarts = smarts;
    }
    
    /**
     * sets the name
     * 
     * @param newName name of shell
     */
    public void setName(String newName) {
        this.name = newName;
    }
    
    //special methods
    
    /**
     * returns string representation of a shell object.
     * 
     * @return string - ascii art depending on gender and eventually other attributes 
     */
    public String toString(){
        if (this.isMale())
            return " ____  \n|>._.|>\n ^  ^  \n" + "His name is " + name + ".";
        else return "  ____ \n<|._.<|\n  ^  ^ \n" + "Her name is " + name + ".";
    }
}

