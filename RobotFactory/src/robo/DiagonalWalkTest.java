package robo;

public class DiagonalWalkTest extends CharlieRobot{


		public DiagonalWalkTest(String name, String model) {
		super(name, model);
	}

		public void test() {
		    setCharge(-100);
			
			setCharge(1000);
			
			
			setCharge(50);
			
	       while (getCharge()>5) {
	    	   System.out.print(" " + getCharge()+ " ");
	    	   moveDownRight();
		}
	       
			System.out.println(getCharge());
		}
		
	}


