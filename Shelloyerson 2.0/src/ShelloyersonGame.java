import java.util.Scanner;

public class ShelloyersonGame {

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
                	System.out.print(">>");
                	break;
                case "quit":
                    end = true;
                    break;
                case "new":
                	newShell(currentUser);
                    break;
                case "view":
                	break;
//                case "breed":
//                    breed();
//                    break;
                case "login":
                	currentUser = login();
                	break;
                default:
                	System.out.println("Please type a valid command");
                	System.out.print(">>");
                    break;
                }
            }
        }
        System.out.println("Thank you for playing Shelloyerson Simulator 2014\nGoodbye!");
    }
    public static void intro(){
        System.out.println("Welcome to Shelloyerson Simulator 2014");
        System.out.println();
        System.out.println("Type \"help\" if you need help");
        System.out.print(">>");
    }

    public static void list(){
        System.out.println("Commands: help, quit, login, new, view, or breed");
    }
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
        return user1;
    }
    
    public static void newShell(ShellUser username){
        System.out.println("Oh, so you want a new shelloyerson, huh?");
        System.out.print("Please enter your new Shelloyerson's name: ");
        Scanner namer = new Scanner(System.in);
        String name = namer.next();

    }
}
