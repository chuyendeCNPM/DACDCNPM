package airxonix.nhom28.commands;
import airxonix.nhom28.objects.GameWorld;

public class MoveCarHeadingToWest implements IOrder{
	private GameWorld gw;

	public MoveCarHeadingToWest(GameWorld gw) {
		super();
		this.gw = gw;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		gw.moveCarHeadingToWest();
	}
	

}
