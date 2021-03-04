package robo;

public class ChargeTest extends BetaRobot implements HasBatteryInterface{
   
	public void battery() {
	    setCharge(-100);
		
		setCharge(1000);
		
		
		setCharge(50);
		
       while (getCharge()>5) {
    	   System.out.print(" " + getCharge()+ " ");
    	   moveRight();
	}
       
		System.out.println(getCharge());
	}
	
	
	
	

	
	
}
