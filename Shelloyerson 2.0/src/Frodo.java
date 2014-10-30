import java.util.ArrayList;
import java.util.Scanner;

public class Frodo {
	public static void main(String[] args) {
		boolean done = false;
		Shelloyerson hamburger = new Shelloyerson ("name");
		String noname = "name/stupid/dumb/fart/toot/poop/butt";
		Scanner s = new Scanner(System.in);
		int id = 1;
		ArrayList<Shelloyerson> guys = new ArrayList<Shelloyerson>();
		guys.add(hamburger);
		System.out.println("________________________________________________________");
		System.out.println("Shelloyerson Namer 2014");
		System.out.println("________________________________________________________");
		System.out.println(" ____");
		System.out.println("[>._.]>");
		System.out.println(" ^  ^     *waaah*");
		System.out.println("");
		System.out.println("Help, this poor Shelloyerson doesn't have a name!");
		System.out.println("What do you want to name your li'l Shelloyerson?");
		do {
			System.out.print(">>> ");
			guys.get(0).setName(s.nextLine());
			if (noname.contains(hamburger.getName().toLowerCase())) {
				System.out.println("That's mean, you shouldn't name him that.");
			}
		} while (noname.contains(hamburger.getName().toLowerCase()));
		System.out.print(guys.get(0).getName()+"'s name ");
		if (guys.get(0).nameStartsWithD()) {
			System.out.println("starts with D.");
		} else {
			System.out.println("doesn't start with D.");
		}
		while (!done) {
			System.out.print(">>> ");
			String input = s.nextLine();
			if (input.toLowerCase().contains("hello")) {                                                                  //hello
				System.out.println("Well, hello to you too.");
			} else if (input.toLowerCase().contains("quit")) {                                                            //quit
				System.out.println("Bye-bye!");
				done = true;
			} else if (input.toLowerCase().contains("help")) {                                                            //help
				System.out.println("Commands:");
				System.out.println(" -hello");
				System.out.println(" -sorry");
				System.out.println(" -rename <shelloyerson name>");
				System.out.println(" -add");
				System.out.println(" -list");
				System.out.println(" -quit"); 
			} else if (input.toLowerCase().contains("name")) {                                                            //rename
				boolean foundSomeoneToName = false;
				for (int i = 0; i < guys.size(); i++) {
					if (input.toLowerCase().contains(guys.get(i).getName().toLowerCase())) {
						System.out.print("What do you want to rename "+guys.get(i).getName()+"?\n>>> ");
						String newName = s.nextLine();
						if (newName.compareTo(guys.get(i).getName()) == 0) {
							System.out.println("Don't be silly, that's already "+guys.get(i).getName()+"'s name.");
						} else {
							boolean sameName = false;
							for (int j = 0; j < guys.size(); j++) {
								if (newName.toLowerCase().compareTo(guys.get(j).getName().toLowerCase()) == 0) {
									System.out.println("You've already got a Shelloyerson named "+newName+"...");
									sameName = true;
								}
							}
							if (!sameName) {
								System.out.print(guys.get(i).getName());
								guys.get(i).setName(newName);
								System.out.print("'s name is now "+guys.get(i).getName()+", which ");
								if (guys.get(i).nameStartsWithD()) {
									System.out.println("starts with D.");
								} else {
									System.out.println("doesn't start with D.");
								}
							}
						}
						foundSomeoneToName = true;
						break;
					}
				}
				if (!foundSomeoneToName) {
					System.out.println("Come again?");
				}
			} else if (input.toLowerCase().contains("add")) {                                                               //add
				System.out.println("What do you want to name your new Shelloyerson?");
				System.out.print(">>> ");
				String newName = s.nextLine();
				boolean sameName = false;
				for (int j = 0; j < guys.size(); j++) {
					if (newName.toLowerCase().compareTo(guys.get(j).getName().toLowerCase()) == 0) {
						System.out.println("You've already got a Shelloyerson named "+newName+"...");
						sameName = true;
					}
				}
				if (!sameName) {
					guys.add(new Shelloyerson(newName));
					System.out.println("You are now the proud owner of a new Shelloyerson.");
					System.out.print("This Shelloyerson is named "+guys.get(id).getName()+", which ");
					if (guys.get(id).nameStartsWithD()) {
						System.out.println("starts with D.");
					} else {
						System.out.println("doesn't start with D.");
					}
					id++;
				}
			} else if (input.toLowerCase().contains("list")) {                                                            //list
				for (int i = 0; i < guys.size(); i++) {
					System.out.println(" ____");
					System.out.println("[>._.]>");
					System.out.println(" ^  ^");
					System.out.println(guys.get(i).getName());
				}
			} else if (input.toLowerCase().contains("sorry")) {                                                           //sorry
				System.out.println("Awww *purr*");
				}	
				else {
				System.out.println("How rude!");
			}
		}
	}
}

