package quiz_16;

public class Circle implements Shape {
//	private double radius;
//
//	Circle(double radius) {
//
//		this.radius = radius;
//	}
//
//	public double getRadius() {
//		return this.radius;
//	}
//
//	void setRadius(double radius) {
//		this.radius = radius;
//	}
//
//	@Override
//	public double getArea() {
//
//		return Math.PI * (this.radius * this.radius);
//	}
//
//	@Override
//	public double getPerimeter() {
//
//		return (2 * Math.PI * radius);
//	}
//
//}
private double radius;
double pi=3.1416;
public void setRadius(double radius) {
	this.radius = radius;
}
public double getRadius() {
	return radius;
}
@Override
public double getArea() {
	System.out.println("Radius of the circle: "+radius);
	double Area;
	Area=pi*radius*radius;
	System.out.println("Area of the circle: "+String.format("%.2f", Area));
	return Area;
}
@Override
public double getPerimeter() {
	
	double Perimeter=2*pi*radius;				
	System.out.println("Perimeter of the circle: "+String.format("%.2f", Perimeter));
	return Perimeter;
}

}
