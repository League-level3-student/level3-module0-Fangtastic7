package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		Robot[] robot = new Robot[5];
		boolean winner = false;
		for(int i=0; i<robot.length;i++) {
			robot[i] = new Robot();
			robot[i].setX(i * 100 + 200);
			robot[i].setY(500);
	
		}
	
		while (!winner) {
			for(Robot racer : robot) {
				int robotcounter = 0;
				int distance = new Random().nextInt(50);
				robotcounter += 1;
				racer.setSpeed(1000);
				racer.move(distance);
				
				if(racer.getY() <= 0) {
					winner = true;
					System.out.println("Robot " + robotcounter + " won the race!");
					racer.sparkle();
					racer.setWindowSize(2000, 1000);
					racer.unSparkle();
				}
			}
		}
		robot[0].setX(1300);
		robot[0].setY(500);
		robot[0].penDown();
		robot[0].turn(180);
		robot[0].move(250);
		
		
		
		//making circular track
		
		for(int i=0; i<5;i++) {
			robot[i].setX(400);
			robot[i].setY(500 + (i*50));
			robot[i].penDown();
			if(i==0) {
				robot[i].turn(-90);
			}
			else {
			robot[i].turn(90);
			}
			for(int y=0; y<2;y++) {
			
			robot[i].move(900 + (i* 25));
			for(int x=0; x<18;x++) {
				robot[i].turn(-10);
				robot[i].move((i* 10) + 20);
				}
		
			}
		}
		//set places for start
		for(int i=0;i<5;i++) {
			robot[i].penUp();
			robot[i].setX(400 + (i*225));
			//robot[i].setY(525 + (i*50));
			
		}
		
		Thread one = new Thread(()->race(robot[0], 0));
		Thread two = new Thread(()->race(robot[1], 1));
		Thread three = new Thread(()->race(robot[2], 2));
		Thread four = new Thread(()->race(robot[3], 3));
		Thread five = new Thread(()->race(robot[4], 4));
		
		one.start();
		two.start();
		three.start();
		four.start();
		five.start();
		
		
	
		//2. create an array of 5 robots.

		//3. use a for loop to initialize the robots.

			//4. make each robot start at the bottom of the screen, side by side, facing up
	
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
    	
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

		
	
		}

	public static int  race(Robot bot, int i) {
		// TODO Auto-generated method stub
		Random speed = new Random();
		bot.setSpeed(speed.nextInt(10));
		bot.move(1000- (i*225));
		rotate(bot, i);
		bot.move(900 + (i* 25));
		rotate(bot, i);
		bot.setSpeed(speed.nextInt(10));
		bot.move(900 + (i* 25));
		System.out.println("Robot " + i + " has finished the race!");
		return i;
	}

	public static void rotate(Robot bot, int i) {
		// TODO Auto-generated method stub
		Random speed = new Random();
		bot.setSpeed(speed.nextInt(10));
		for(int x=0; x<18;x++) {
			bot.turn(-10);
			bot.move((i* 10) + 20);
			}
	}
}
