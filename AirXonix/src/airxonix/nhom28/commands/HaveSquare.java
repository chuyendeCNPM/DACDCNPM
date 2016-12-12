package airxonix.nhom28.commands;

import airxonix.nhom28.objects.GameWorld;

public class HaveSquare implements IOrder{
	private GameWorld gw;
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		gw.haveSquare();
	}
	public HaveSquare(GameWorld gw) {
		super();
		this.gw = gw;
	}

}
