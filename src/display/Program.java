package display;

import display.menulist.Exit;
import display.menulist.Fight;
import display.menulist.MenuModel;
import display.menulist.StandGacha;
import display.menulist.StandStats;
import display.menulist.StandStorage;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	List<MenuModel> mainOptions = new ArrayList<>();
	Scanner scan = new Scanner(System.in);
	
	private void menuListing() {
		mainOptions.add(new Fight());
		mainOptions.add(new StandStats());
		mainOptions.add(new StandGacha());
		mainOptions.add(new StandStorage());
		mainOptions.add(new Exit());
	}

	public Program() {
		menuListing();
		
		System.out.println("========================================");
		System.out.println("WELCOME TO STAND ARENA!");
		System.out.println("========================================");
		
		MenuCommand mainmenu = new MenuCommand(mainOptions, 0);
		boolean running = true;
		
		while(running) {
			renderMenu(mainmenu);
			
			System.out.print("Press 'w' (Up), 's' (Down), or 'e' (Select): ");
            String input = scan.nextLine().trim().toLowerCase();

            // Interact with the Model based on input
            switch (input) {
                case "w":
                    mainmenu.Up();
                    break;
                case "s":
                    mainmenu.Down();
                    break;
                case "e":
                    mainmenu.Select();
                    break;
                default:
                    System.out.println("Invalid input.");
            }
		}
	}
	
	private static void renderMenu(MenuCommand Model) {
		System.out.println("\n--- MAIN MANU ---");
		List<MenuModel> options = Model.getOptions();
		
		for(int i = 0;i < options.size();i++) {
			if (i == Model.getSelected()) {
                System.out.println(" > [ " + options.get(i).getMenuName() + " ] < ");
            } else {
                System.out.println("     " + options.get(i).getMenuName());
            }
		}
		System.out.println("----------------------");
	}

	public static void main(String[] args) {
		new Program();

	}

}
