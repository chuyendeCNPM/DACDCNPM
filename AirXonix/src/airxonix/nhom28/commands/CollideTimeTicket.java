package airxonix.nhom28.commands;

import airxonix.nhom28.objects.GameWorld;

public class CollideTimeTicket implements IOrder{
	private GameWorld gw;
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		gw.collideTTicket();
	}
	public CollideTimeTicket(GameWorld gw) {
		super();
		this.gw = gw;
	}

}
