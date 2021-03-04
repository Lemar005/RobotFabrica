package robo;

public class BetaRobot extends AlphaRobot implements HasBatteryInterface{
	
	private String name;
	private String model;
	private int x;
	private int y;
	private byte charge;
	
	 BetaRobot() {}
	 BetaRobot(String name, String model) {
		super(name, model) ;
		this.name = name;
		this.model = model;
		setCharge((byte)0);
	}
	 @Override
	public byte getCharge() {
		return (byte)charge;
	}
	@Override
	public void setCharge(int charge) {
		if(charge < 0 && charge > 100)
			System.err.println("Charge test failed\nREASON: charge must to be at 0 to 100");
		else {this.charge = (byte) charge;
		            
		}
	}
	@Override
	public boolean moveRight() {     
		x+=2;
		charge -=1;
		if(x == x+2) {
			charge -=1;
			return true;
		}
		if(getCharge()>5 ) {
			return true;
			
			}
		else
			return false;
	}
	@Override
	public boolean moveLeft() {    
		x-=2;
		charge -=1;
		if(x == x-2) {
			setCharge(getCharge()-1);
			return true;
		}
		if(getCharge()<5) {
			return false;
			}
		else
			return true;
	}
	@Override
	public boolean moveDown() {
		y+=2;
		charge -=1;
			if(y == y+2) {
			setCharge(getCharge()-1);
			return true;
		}
		if(getCharge()<5) {
			return false;
			}
		else
			return true;
	}
	@Override
	public boolean moveUp() {
		y-=2;
		charge -=1;
		if(y == y-2) {
			setCharge(getCharge()-1);
			return true;
		}
		if(getCharge()<5) {
			return false;
			}
		else
			return true;
	}
	@Override
	public String toString() {
		return "BetaRobot [name=" + name + ", model=" + model + "]";
	}
	
	
}
