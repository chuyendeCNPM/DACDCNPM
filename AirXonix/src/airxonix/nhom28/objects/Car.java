package airxonix.nhom28.objects;
import java.awt.Color;
import java.util.Random;
import airxonix.nhom28.interfaces.IChangeColor;
import airxonix.nhom28.interfaces.ISteerable;


public class Car extends MoveObject{

	private int width;
	private int height;
	public Car(IChangeColor changeColor, ISteerable steerable) {
		super(changeColor, steerable);
		Random rand = new Random();
		this.width = rand.nextInt(5);
		this.height = rand.nextInt(5);
	}
	
	@Override
	public String toString() {
		Location loca = this.location;
		Color color = this.color;
		return "Car: loc="+loca.getX()+","+loca.getY()+
				" color=["+color.getRed()+","+color.getGreen()+","+color.getBlue()+
				"] speed="+this.speed+
				" heading="+this.heading+
				" width="+this.width+
				" height="+this.height;
	}

}
