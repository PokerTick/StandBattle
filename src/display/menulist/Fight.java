package display.menulist;

public class Fight implements MenuModel{
	@Override
	public String getMenuName() {
		// TODO Auto-generated method stub
		return "1. Fight";
	}
	@Override
	public void execute() {
		System.out.println("Searching for Stand user...");
		System.out.println("Founded a Stand user! Prepare for battle!");
		System.out.println("BATTLE START!");
		//add function here
	}
}


