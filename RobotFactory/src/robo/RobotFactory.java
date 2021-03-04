package robo;

import test.SimpleTest;

public class RobotFactory {
	public static AbstractRobot getRobot(String name, String model) {
		
//		System.out.printf( "Simple test passed %d%%\n", SimpleTest.runCase( new AlphaRobot("Robic","Alpha") ) );
//		System.out.printf( "Simple test passed %d%%\n", SimpleTest.runCase( new BetaRobot("Bob","Beta") ) );
//		System.out.printf( "Simple test passed %d%%\n", SimpleTest.runCase( new CharlieRobot("Charlie","User") ) );
		
		
		
		if(name.equals("Rob") && model.equals("Alpha") ) {
			return new AlphaRobot(name, model);
		}
		else if(model.equals("Beta")) {
			return new BetaRobot(name, model);
		}
		else if(model.equals("Charlie")) {
			return new CharlieRobot(name, model);
		}
		else {
			return null;}
	
		
		
	}
}
