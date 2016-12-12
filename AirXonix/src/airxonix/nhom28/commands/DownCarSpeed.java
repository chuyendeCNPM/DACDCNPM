package airxonix.nhom28.commands;

import airxonix.nhom28.objects.GameWorld;

public class DownCarSpeed implements IOrder{
	private GameWorld gw;
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		gw.downCarSpeed();
	}
	public DownCarSpeed(GameWorld gw) {
		super();
		this.gw = gw;
	}

}
