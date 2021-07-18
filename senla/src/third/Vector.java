package third;

public class Vector {
   private int x1;
   private int y1;
   private int x2;
   private int y2;
   private int z1;
   private int z2;
   
public Vector(int x1, int y1, int x2, int y2) {
	super();
	this.x1 = x1;
	this.y1 = y1;
	this.x2 = x2;
	this.y2 = y2;
	this.z1 = 0;
	this.z2 = 0;
}
public Vector(int x1, int y1, int x2, int y2, int z1, int z2) {
	super();
	this.x1 = x1;
	this.y1 = y1;
	this.x2 = x2;
	this.y2 = y2;
	this.z1 = z1;
	this.z2 = z2;
}

public int x() {
   return x1 - x2;
}
public int y() {
	   return y1 - y2;
	}
public int z() {
	 return z1 - z2;
	}
public void setX1(int x1) {
	this.x1 = x1;
}
public double getLength(){
	   return Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
   }
   public Vector mult(Vector v2) {
	   return new Vector(0, (y()*v2.z()-z()*v2.y()), 0, -(x()*v2.z()-z()*v2.x()), 0, (y()*v2.x()-x()*v2.y()));
   }
   
@Override
public String toString() {
	return "начало (" + x1 + "," + y1 + "," + z1 + "), конец (" + x2 + "," + y2 + "," + z2 +  ") " ;
}
   
}
