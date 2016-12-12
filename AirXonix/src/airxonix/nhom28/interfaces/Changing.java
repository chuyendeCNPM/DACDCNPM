package airxonix.nhom28.interfaces;
import java.awt.Color;
import java.util.Random;

public class Changing implements IChangeColor {
	@Override
	public Color change() {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Color color = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
		return color;
	}

}
