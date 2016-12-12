package airxonix.nhom28.commands;

import airxonix.nhom28.objects.GameWorld;

public class MoveCarHeadingToSouth implements IOrder{
	private GameWorld gw;

	public MoveCarHeadingToSouth(GameWorld gw) {
		super();
		this.gw = gw;
	};
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		gw.moveCarHeadingToSouth();
		
	}

}
