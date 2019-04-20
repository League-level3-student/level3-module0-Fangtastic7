package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		Robot[] robot = new Robot[5];
		boolean winner = false;
		boolean winner2 = false;
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
		for(int i=0;i<5;i++) {
			robot[i].penUp();
			robot[i].setX(400 + (i*225));
			robot[i].setY(525 + (i*50));
			
		}
		while(!winner2) {
			for(int i=0;i<5;i++) {
				if(robot[0].getX() >= 1300 || robot[0].getX() <= 400) {
					robot[0].turn(-10);
					robot[i].move((i* 10) + 20);
				}
				else if(robot[1].getX() >= 1325 || robot[1].getX()<= 400){
					robot[1].turn(-10);
					robot[1].move(30);
				}
				else if(robot[2].getX() >=1350 || robot[2].getX() <= 400) {
					robot[2].turn(-10);
					robot[2].move(40);
				}
				else if(robot[3].getX() >=1375 || robot[3].getX() <= 400) {
					robot[3].turn(-10);
					robot[3].move(50);
			}
				else if(robot[4].getX() >=1400 || robot[4].getX() <= 400) {
					robot[4].turn(-10);
					robot[4].move(60);
		}
				else {
					robot[i].move(900 + (i* 25));
				}
		}
		
	}
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
}
