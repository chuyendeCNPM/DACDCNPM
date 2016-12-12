package airxonix.nhom28.objects;
import java.util.Scanner;

import airxonix.nhom28.commands.AddMonsterBall;
import airxonix.nhom28.commands.AddTimeTicket;
import airxonix.nhom28.commands.Broker;
import airxonix.nhom28.commands.CollideMonsterBall;
import airxonix.nhom28.commands.CollideTimeTicket;
import airxonix.nhom28.commands.Display;
import airxonix.nhom28.commands.DownCarSpeed;
import airxonix.nhom28.commands.HaveSquare;
import airxonix.nhom28.commands.MoveCarHeadingToEast;
import airxonix.nhom28.commands.MoveCarHeadingToNorth;
import airxonix.nhom28.commands.MoveCarHeadingToSouth;
import airxonix.nhom28.commands.MoveCarHeadingToWest;
import airxonix.nhom28.commands.ShowMap;
import airxonix.nhom28.commands.TickClock;
import airxonix.nhom28.commands.UpCarSpeed;
import airxonix.nhom28.commands.UpOwnedSquare;



public class Game {
	private GameWorld gw;
	
	public Game()
	{
		gw = new GameWorld();
		play();
	}

	private void play() {
		// TODO Auto-generated method stub
		Broker broker = new Broker();
		System.out.println("22222222222");
		while(true){
			char command = getCommand();
			switch(command){
			case 'n':
				MoveCarHeadingToNorth n = new MoveCarHeadingToNorth(gw);
				broker.takeOrder(n);
				break;
			case 's':
				MoveCarHeadingToSouth s = new MoveCarHeadingToSouth(gw);
				broker.takeOrder(s);
				break;
			case 'e':
				MoveCarHeadingToEast e = new MoveCarHeadingToEast(gw);
				broker.takeOrder(e);
				break;
			case 'w':
				MoveCarHeadingToWest w = new MoveCarHeadingToWest(gw);
				broker.takeOrder(w);
				break;
			case 'i':
				UpCarSpeed i = new UpCarSpeed(gw);
				broker.takeOrder(i);
				break;
			case 'l':
				DownCarSpeed l = new DownCarSpeed(gw);
				broker.takeOrder(l);
				break;
			case 'b':
				AddMonsterBall b = new AddMonsterBall(gw);
				broker.takeOrder(b);
				break;
			case 'k':
				AddTimeTicket k = new AddTimeTicket(gw);
				broker.takeOrder(k);
				break;
			case 'g':
				HaveSquare g = new HaveSquare(gw);
				broker.takeOrder(g);
				break;
			case '1':
				CollideMonsterBall c1 = new CollideMonsterBall(gw);
				broker.takeOrder(c1);
				break;
			case '2':
				UpOwnedSquare c2 = new UpOwnedSquare(gw);
				broker.takeOrder(c2);
				break;
			case '3':
				CollideTimeTicket c3 = new CollideTimeTicket(gw);
				broker.takeOrder(c3);
				break;
			case 't':
				TickClock t = new TickClock(gw);
				broker.takeOrder(t);
				break;
			case 'd':
				Display d = new Display(gw);
				broker.takeOrder(d);
				break;
			case 'm':
				ShowMap m = new ShowMap(gw);
				broker.takeOrder(m);
				break;
			case 'q':
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Command");
				break;
			}// end switch 
			broker.placeOrders();
		}// end while
	}
	
	private char getCommand(){
		Scanner objScanner = new Scanner(System.in);
		String commands = "";
		char c=' ';
		do{
			System.out.print("Enter Your Single-character: ");
			commands = objScanner.next();
			c = commands.charAt(0);
			if(commands.length() != 1)
				System.out.println("Please Enter Again!!!");
		}while(commands.length() != 1);
		return c;
	}
		
		
	

}
