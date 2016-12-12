package airxonix.nhom28.objects;

import java.awt.Color;
import airxonix.nhom28.interfaces.IChangeColor;

public class Object {
	protected Location location;
	protected Color color;
	protected IChangeColor changeColor;
	public Object(IChangeColor changeColor) {
		super();
		this.changeColor = changeColor;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
}
