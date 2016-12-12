package airxonix.nhom28.commands;

import airxonix.nhom28.objects.GameWorld;

public class Display implements IOrder{
	private GameWorld gw;
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		gw.displayValue();
	}
	public Display(GameWorld gw) {
		super();
		this.gw = gw;
	}

}
