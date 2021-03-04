package robo;

 interface Moveable2DInterface {
	      boolean moveRight();
	      boolean moveLeft();
	      boolean moveDown();
	      boolean moveUp();
}

 interface Has2DCoordinatesInterface {
	     public abstract void setName(String name);
	     public abstract String getName();

	     public abstract void setModel(String model);
	     public abstract String getModel();

	     public abstract void setX(int x);
	     public abstract int getX();

	     public abstract void setY(int y);
	     public abstract int getY();
}
 
