package ex13_8_clone_2_1_shallow;

public class Circle implements Cloneable {

	Point p;
	double r;
	
	Circle (Point p, double r) {
		this.p = p;
		this.r = r;
	}
	
	public Circle clone() {
		try {
			return (Circle) super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
	public String toString() {
		return "[p=" + p +", r=" + r + "]";
		
	}
}
