import java.util.Scanner;

public class ShelloyersonGame {

	/**
	 * main class! runs the game.
	 */
    public static void main(String[] args) {
    	Shelloyerson currentShell = null;
    	ShellUser currentUser = null;
    	
    	intro();
    	
        Scanner console = new Scanner(System.in);
        
        boolean end = false;
        while (!end){
            String input = console.nextLine();
            input = input.toLowerCase();
            Scanner s = new Scanner(input);
            while (s.hasNext()){
                String next = s.next();
                switch(next){
                case "help":
                	list();
                	System.out.print(">> ");
                	break;
                case "quit":
                    end = true;
                    break;
                case "new":
                	newShell(currentUser);
                	System.out.print(">> ");
                    break;
                case "view":
                	viewShell(currentUser);
                	System.out.print(">> ");
                	break;
//                case "breed":
//                    breed();
//                    break;
                case "login":
                	currentUser = login();
                	System.out.print(">> ");
                	break;
                case "aight":
                	System.out.println("skeet skeet");
                	System.out.print(">> ");
                	break;
                default:
                	System.out.println("Please type a valid command");
                	System.out.print(">> ");
                    break;
                }
            }
        }
        System.out.println("Thank you for playing Shelloyerson Simulator 2014\nGoodbye!");
    }
    
    /**
     * method to run the introduction sequence. queue the action music, the high speed animation of shelloyersons
     * etc etc etc.
     */
    public static void intro(){
        System.out.println("Welcome to Shelloyerson Simulator 2014");
        System.out.println();
        System.out.println("Type \"help\" if you need help");
        System.out.print(">> ");
    }

    /**
     * a method that prints a list of available commands. probably doesn't need its own method.
     */
    public static void list(){
        System.out.println("Commands: help, quit, login, new, view, or breed");
    }
    
    /**
     * right now this method actually creates a new user, instead of logging in.
     * We'll have to create an actual login method that compares the entered user to a list.
     * Man we really need to learn ArrayLists.
     * 
     * @return a ShellUser, which contains the username and the array of shelloyersons
     */
    public static ShellUser login(){
    	Scanner s = new Scanner(System.in);
    	System.out.println("Ah, I bet you'd like to log in, wouldn't you?");
		System.out.println("I suppose I'll let you... with the right username, of course: ");
		System.out.print(">>");
    	ShellUser user1 = null;
    	String input = s.next();
    	input = input.toLowerCase();
    	user1 = new ShellUser(input);
    	System.out.println("Thanks, you've logged in " + user1 + ".");
    	System.out.println("You may now mess with your shelloyersons.");
    	System.out.print(">> ");
        return user1;
    }
    
    /**
     * creates a new shelloyerson and places it in the user's shelloyerson array.
     * asks the user for input on naming the shelloyerson, and tells them whether
     * each slot is available
     * 
     * @param username determines which user gets the new shelloyerson
     */
    public static void newShell(ShellUser username){
        System.out.println("Oh, so you want a new shelloyerson, huh?");
        System.out.print("Please enter your new Shelloyerson's name: ");
        Scanner namer = new Scanner(System.in);
        String name = namer.next();
        Shelloyerson shell = new Shelloyerson(name);
        boolean stillNeedsSlot = true;
        for(int i = 0; stillNeedsSlot == true && i < username.getUShells().length; i++){
        	int slotNum = i + 1;
        	if(username.getShell(i) == null){
        		username.setShell(shell, i);
        		stillNeedsSlot = false;
        		System.out.println(slotNum + " Found an available slot! Yay!");
        	} else {
        		System.out.println(slotNum + " This shell slot is taken, sorry!");
        	}
        		
         }
    }
    
    /**
     * this method prints out a shell of the current user's choice, asks for input on which 
     * slot to display
     * 
     * @param currentUser determines which user's shell to display. will be more useful later.
     */
    public static void viewShell(ShellUser currentUser){
    	System.out.println("You want to have your shelloyerson and see it too?\nOh alright...");
    	Scanner number = new Scanner(System.in);
    	int num = number.nextInt();
    	System.out.println(currentUser.getShell(num).toString());
    }
}
