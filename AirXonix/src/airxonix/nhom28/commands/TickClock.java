package airxonix.nhom28.commands;

import airxonix.nhom28.objects.GameWorld;

public class TickClock implements IOrder{
	private GameWorld gw;
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		gw.tickClock();
	}
	public TickClock(GameWorld gw) {
		super();
		this.gw = gw;
	}

}
