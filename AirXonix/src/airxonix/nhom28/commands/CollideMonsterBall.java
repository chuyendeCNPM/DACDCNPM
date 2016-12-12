package airxonix.nhom28.commands;
import airxonix.nhom28.commands.IOrder;
import airxonix.nhom28.objects.GameWorld;

public class CollideMonsterBall implements IOrder{
	private GameWorld gw;
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		gw.collideMBall();
	}
	public CollideMonsterBall(GameWorld gw) {
		super();
		this.gw = gw;
	}

}
