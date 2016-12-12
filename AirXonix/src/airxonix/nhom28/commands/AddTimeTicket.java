package airxonix.nhom28.commands;
import airxonix.nhom28.objects.GameWorld;

public class AddTimeTicket implements IOrder{
	private GameWorld gw;

	public AddTimeTicket(GameWorld gw) {
		super();
		this.gw = gw;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		gw.addTimeTicket();
		
	}

}
