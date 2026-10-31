package display;

import display.menulist.MenuModel;
import java.util.List;

public class MenuCommand {
	private final List<MenuModel> options;
	private int selected;
	
	public MenuCommand(List<MenuModel> options, int selected) {
		this.options = options;
		this.selected = selected;
	}

	public List<MenuModel> getOptions() {
		return options;
	}
	
	public int getSelected() {
		return selected;
	}

	public void setSelected(int selected) {
		this.selected = selected;
	}

	public void Up() {
		if(selected > 0)selected--;
	}
	
	public void Down() {
		if(selected < options.size() - 1)selected++;
	}
	
	public void Select() {
		if (selected >= 0 && selected < options.size()) {
			options.get(selected).execute();
		}
	}
	
}
