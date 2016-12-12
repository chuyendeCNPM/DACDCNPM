package airxonix.nhom28.interfaces;

import airxonix.nhom28.objects.Location;

public class Moving implements IMove{
	@Override
	public Location move(Location location, int speed, int heading) {
		// TODO Auto-generated method stub
		Location loca = new Location(location.getX()+(float)(Math.cos(90-heading)*speed), 
				location.getY()+(float)(Math.sin(90-heading)*speed));
		return loca;
	}

}
