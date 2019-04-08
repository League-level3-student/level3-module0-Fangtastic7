package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		Robot[] robot = new Robot[5];
		boolean winner = true;
		
		for(int i=0; i<robot.length;i++) {
			robot[i] = new Robot();
			robot[i].setX(i * 100 + 200);
			robot[i].setY(500);
	
		}
	
		while (winner) {
			for(Robot racer : robot) {
				int robotcounter = 0;
				int distance = new Random().nextInt(50);
				robotcounter += 1;
				racer.setSpeed(10);
				racer.move(distance);
				
				if(racer.getY() <= 0) {
					winner = false;
					System.out.println("Robot " + robotcounter + " won the race!");
					racer.sparkle();
					racer.setWindowSize(5000, 3000);
				}
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
