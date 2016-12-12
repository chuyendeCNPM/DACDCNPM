package airxonix.nhom28.objects;
import airxonix.nhom28.interfaces.IChangeColor;
import airxonix.nhom28.interfaces.IMove;
import airxonix.nhom28.interfaces.ISteerable;


public class MoveObject extends Object{
	
	protected int heading;
	protected int speed;
	protected ISteerable steerable;
	protected IMove move;
	public MoveObject(IChangeColor changeColor, ISteerable steerable) {
		super(changeColor);
		this.steerable = steerable;
	}
	public int getHeading() {
		return heading;
	}
	public void setHeading(int heading) {
		this.heading = heading;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}


}
