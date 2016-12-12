package airxonix.nhom28.commands;

import airxonix.nhom28.objects.GameWorld;

public class UpOwnedSquare implements IOrder{
	private GameWorld gw;
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		gw.upOwnedSquare();
	}
	public UpOwnedSquare(GameWorld gw) {
		super();
		this.gw = gw;
	}

}
