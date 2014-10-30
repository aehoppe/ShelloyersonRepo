import java.util.Scanner;

public class ShelloyersonGame {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner console = new Scanner(System.in);
        Shelloyerson s1 = intro(console);
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
                	break;
                case "quit":
                    end = true;
                    break;
//                case "new":
//                    Shelloyerson s2 = newShelloyerson();
//                    break;
                case "view":
                	System.out.println(s1);
                    break;
//                case "breed":
//                    breed();
//                    break;
                default:
                    break;
                }
            }
        }
        System.out.println("Thank you for playing Shelloyerson Simulator 2014\nGoodbye!");
    }
    public static Shelloyerson intro(Scanner s){
        System.out.println("Welcome to Shelloyerson Simulator 2014");
        Shelloyerson s1 = new Shelloyerson();
        System.out.println("your new Shelloyerson is " + s1.getGender());
        System.out.println("What would you like to name your new Shelloyerson?");
        System.out.println(">> ");
        s1.setName(s.next());
        System.out.println();
        System.out.println("Type \"help\" if you need help");
        return s1;
    }

    public static void list(){
        System.out.println("Commands: help, quit, new, view, or breed");
    }
    
    public static Shelloyerson newShelloyerson(){
        System.out.println("Oh, so you want a new shelloyerson, huh?");
        System.out.print("Please enter your new Shelloyerson's name: ");
        Scanner namer = new Scanner(System.in);
        String name = namer.next();
        return new Shelloyerson(name);

    }
}
