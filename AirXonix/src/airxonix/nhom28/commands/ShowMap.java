package airxonix.nhom28.commands;

import airxonix.nhom28.objects.GameWorld;

public class ShowMap implements IOrder {
	private GameWorld gw;
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		gw.showMap();
	}
	public ShowMap(GameWorld gw) {
		super();
		this.gw = gw;
	}

}
