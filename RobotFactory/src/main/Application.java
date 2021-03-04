package main;

import robo.*;
import test.*;

public class Application {

	public static void main(String[] args) {

	
	
		AbstractRobot robot1 = RobotFactory.getRobot("Rob", "Alpha");
		AbstractRobot robot2 = RobotFactory.getRobot("Cris", "Beta");
		AbstractRobot robot3 = RobotFactory.getRobot("Robot", "Charlie");

       System.out.println(robot1 + "\n" 
                        + robot2 + "\n" 
                        + robot3);
       
		robot2 = RobotFactory.getRobot("Cris", "Bet");

         System.out.println(robot2);

	
	ChargeTest test = new ChargeTest();
	test.battery();
	
	DiagonalWalkTest test2 = new DiagonalWalkTest("Robot", "PoDiagonali");
	test2.test();
	}
	//RobotFactory.getRobot(); 
}
