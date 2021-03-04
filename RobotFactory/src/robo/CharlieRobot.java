package robo;

public class CharlieRobot extends BetaRobot{

	private String name;
	private String model;
	
	 CharlieRobot() {}
	 CharlieRobot(String name, String model) {
		super(name, model);
		this.name = name;
		this.model = model;
	}
    
	
	public boolean moveDownRight() {
		if(moveRight() && moveDown()) {
			return true;
		}
		return false;
	}
	
	public boolean moveDownLeft() {
		if(moveLeft() && moveDown()) {
			return true;
		}
		return false;
	}
	public boolean moveUpRight() {
		if(moveRight() && moveUp()) {
			return true;
		}
		return false;
	}
	public boolean moveUpLeft() {
		if(moveLeft() && moveUp()) {
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return "CharlieRobot [name=" + name + ", model=" + model + "]";
	}
	
}
