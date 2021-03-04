package robo;

public class AlphaRobot extends AbstractRobot{
	
	private String name;
	private String model;
	private int x;
	private int y;
	
	  AlphaRobot() {}
	  AlphaRobot(String name, String model) {
		this.name= name;
		this.model = model;
		x = 0;
		y = 0;
	}

	
	@Override
	public void setName(String name) {
		if (name != null) {
			this.name = name;
		}else  System.err.println("Name test failed\nREASON: null name not allowed!");

	}
	@Override
	public String getName() {
		return  name;
	}
	@Override
	public void setModel(String model) {
		if (model != null) {
			
			this.model = model;
		}else   System.err.println("Model test failed\nREASON: null model not allowed!");
	}
	
	@Override
	public String getModel() {
		return model;
	}
	@Override
	public void setX(int x) {

		if(x < 0 || x > 100) {
            System.err.println("X coord test failed\nREASON: Values less than 0 and more than 100 not allowed!");

		} else this.x = x;
	}
	@Override
	public int getX() {
		return x;
	}
	@Override
	public void setY(int y) {
		if(y < 0 || y > 100) {
            System.err.println("Y coord test failed\nREASON: Values less than 0 and more than 100 not allowed!");

		} else this.y = y;
	}
	@Override
	public int getY() {
		return y;
	}
	@Override
	public boolean moveRight() {    
		x++; 
		
		if(x != x+1) {
			
			return false;
		}
		return true;
	
	
	}
	@Override
	public boolean moveLeft() {    
		x= x - 1;
		
		if(x != x-1) {
			
			return false;
		}
		return true;
	
	}
	@Override
	public boolean moveDown() {
		y++;
		if(y != y+1) {
			
			return false;
		}
		return true;
	
	}
	@Override
	public boolean moveUp() {
		y=y-1;
		if(y== y-1) {
			return true;
			}
		else
		return false;
	}
	
	@Override
	public String toString() {
		return "AlphaRobot [name=" + name + ", model=" + model + "]";
	}
	public void prininfo() {
		System.out.println("Name = " + getName() + "\nModel = " + getModel());
		System.out.println("coord. X = " + getX() +"\ncoord. Y = " + getY());

	}
}
