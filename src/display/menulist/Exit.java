package display.menulist;

public class Exit implements MenuModel{
	@Override
	public String getMenuName() {
		return "5. Exit";
	}
	@Override
	public void execute() {
		System.out.println("Calling speedwagon to pick you up...");
		System.out.println("Done!");
		System.exit(0);
	}
}

