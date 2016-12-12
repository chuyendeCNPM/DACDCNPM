package airxonix.nhom28.commands;

import airxonix.nhom28.objects.GameWorld;

public class UpCarSpeed implements IOrder {
	private GameWorld gw;
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		gw.upCarSpeed();
	}
	public UpCarSpeed(GameWorld gw) {
		super();
		this.gw = gw;
	}

}
