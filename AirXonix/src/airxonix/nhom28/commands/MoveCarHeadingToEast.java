package airxonix.nhom28.commands;
import airxonix.nhom28.objects.GameWorld;

public class MoveCarHeadingToEast implements IOrder{
	private GameWorld gw;
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		gw.moveCarHeadingToEast();
		
	}
	public MoveCarHeadingToEast(GameWorld gw) {
		super();
		this.gw = gw;
	}

}
