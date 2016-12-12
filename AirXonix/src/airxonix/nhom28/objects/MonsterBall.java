package airxonix.nhom28.objects;
import java.awt.Color;
import java.util.Random;
import airxonix.nhom28.interfaces.IChangeColor;
import airxonix.nhom28.interfaces.ISteerable;



public class MonsterBall extends MoveObject {
	private int radius;
	public MonsterBall(IChangeColor changeColor, ISteerable steerable) {
		super(changeColor, steerable);
		Random rand = new Random();
		this.location = new Location(rand.nextFloat() * 497.5f, rand.nextFloat() * 497.5f);
		this.heading = rand.nextInt(4)*90;
		this.speed = rand.nextInt(10);
		this.color = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
		this.radius = rand.nextInt(5);
	}
	@Override
	public String toString() {
		Location loca = this.location;
		Color color = this.color;
		return "Ball: loc="+loca.getX()+","+loca.getY()+
				" color=["+color.getRed()+","+color.getGreen()+","+color.getBlue()+
				"] speed="+this.speed+
				" heading="+this.heading+
				" radius="+this.radius;
	}

	

	

}
