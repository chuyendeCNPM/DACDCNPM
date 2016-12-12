package airxonix.nhom28.objects;
import java.awt.Color;
import java.util.Random;
import airxonix.nhom28.interfaces.IChangeColor;



public class TimeTicket extends NonMoveObject {
	private int width;
	private int height;
	private int time;

	public TimeTicket(IChangeColor changeColor, int time) {
		super(changeColor);
		Random rand = new Random();
		this.time = time;
		this.location = new Location(rand.nextFloat() * 497.5f, rand.nextFloat() * 497.5f);
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
	@Override
	public String toString() {
		Location loca = this.location;
		Color color = this.color;
		return "TimeTicket: loc="+loca.getX()+","+loca.getY()+
				" color=["+color.getRed()+","+color.getGreen()+","+color.getBlue()+
				"] width="+this.width+
				" height="+this.height+
				" time="+this.time;
		
	}
}
