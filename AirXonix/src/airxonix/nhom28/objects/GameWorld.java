package airxonix.nhom28.objects;
import java.util.ArrayList;
import java.util.Random;
import airxonix.nhom28.interfaces.Changing;
import airxonix.nhom28.interfaces.Steering;
import airxonix.nhom28.interfaces.Unchangging;
import airxonix.nhom28.interfaces.Unsteering;



public class GameWorld {
	private Car car = new Car(new Unchangging(), new Steering());
	private ArrayList<MonsterBall> lstMonBall = new ArrayList<MonsterBall>();
	private ArrayList<TimeTicket> lstTimeTicket = new ArrayList<TimeTicket>();
	FieldSquares fieldSquare = new FieldSquares(new Changing());
	private int ownedSquare = 396;
	private Location startLocation = new Location(247.5f, 2.5f);
	private int currentLevel = 1;
	private int currentClock = 10-(this.currentLevel-1)*2;
	private int currentScore;
	private int currentTimeTicket = 5-(this.currentLevel-1);
	private int live = 3;
	private int minimumScore = (this.currentLevel-1)*10+50;
	
	// xu ly nut 'n'
	public void moveCarHeadingToNorth() {
		this.car.setHeading(0);
	}

	// xu ly nut 's'
	public void moveCarHeadingToSouth() {
		this.car.setHeading(180);
	}

	// xu ly nut 'e'
	public void moveCarHeadingToEast() {
		this.car.setHeading(90);
	}

	// xu ly nut 'w'
	public void moveCarHeadingToWest() {
		this.car.setHeading(270);
	}

	// case 'i'
	public void upCarSpeed() {
		Car tmp1 = this.car;
		car.setSpeed(tmp1.getSpeed() + 1);
	}

	// case 'l'
	public void downCarSpeed() {
		if (car.speed > 0) {
			Car tmp2 = this.car;
			car.setSpeed(tmp2.getSpeed() + 1);
		}
	}

	// case 'b'
	public void addMonsterBall() {
		MonsterBall mBall = new MonsterBall(new Changing(), new Unsteering());
		this.lstMonBall.add(mBall);
	}

	// case 'k'
	public void addTimeTicket() {
		TimeTicket tt = new TimeTicket(new Unchangging(), this.currentTimeTicket);
		this.lstTimeTicket.add(tt);
	}

	// case 'g'
	public void haveSquare() {
		Random rand = new Random();
		int number = rand.nextInt(10000 - this.ownedSquare);
		System.out.println("The number of new owned squares: " + number);
		this.ownedSquare += number;
		if (this.ownedSquare / 100 >= this.minimumScore)
			this.currentLevel++;
	}

	// case '1'
	public void collideMBall() {
		if (this.lstMonBall != null) {
			this.live--;
			if (this.live <= 0)
				System.exit(0);
			this.car.setLocation(this.startLocation);
			this.lstMonBall.get(0).setColor(this.lstMonBall.get(0).changeColor.change());
		} else
			System.out.println("There are no Monster Balls");
	}

	// case '2'
	public void upOwnedSquare() {
		this.ownedSquare++;
		if (this.ownedSquare / 100 >= this.minimumScore)
			this.currentLevel++;
	}

	// case '3'
	public void collideTTicket() {
		if (this.lstTimeTicket != null) {
			this.currentClock += this.lstTimeTicket.get(0).getTime();
			this.lstTimeTicket.remove(0);
		} else
			System.out.println("There are no Time Tickets in the world");
	}

	// case 't'
	public void tickClock() {
		this.car.setLocation(
				this.car.steerable.steer(this.car.getLocation(), this.car.getSpeed(), this.car.getHeading()));
		for (MonsterBall monsterBall : this.lstMonBall) {
			monsterBall.setLocation(monsterBall.move.move(monsterBall.getLocation(), monsterBall.getSpeed(),
					monsterBall.getHeading()));
		}
		this.currentClock--;
		if (this.currentClock <= 0) {
			this.live--;
			this.car.setLocation(this.startLocation);
			if (this.live <= 0)
				System.exit(0);
		}
	}

	// case 'd'
	public void displayValue() {
		System.out.println("The current level: " + this.currentLevel + "\nThe number of lives: " + this.live
				+ "\nThe current countdown clock: " + this.currentClock + "\nThe current score: " + this.currentScore
				+ "\nThe minimum score: " + this.minimumScore);
		;
	}

	// case 'm'
	public void showMap() {
		System.out.println(this.car.toString());
		for (MonsterBall monsterBall : this.lstMonBall) {
			System.out.println(monsterBall.toString());
		}
		for (TimeTicket timeTicket : this.lstTimeTicket) {
			System.out.println(timeTicket.toString());
		}

	}

}
