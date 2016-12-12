package airxonix.nhom28.interfaces;

import airxonix.nhom28.objects.Location;

public class Steering implements ISteerable{
	@Override
	public Location steer(Location lc, int speed, int heading) {
		// TODO Auto-generated method stub
		Location loca = new Location(lc.getX()+(float)(Math.cos(90-heading)*speed), 
				lc.getY()+(float)(Math.sin(90-heading)*speed));
	return loca;
		
	}

}
