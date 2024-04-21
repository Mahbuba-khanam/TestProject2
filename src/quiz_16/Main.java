package quiz_16;

public class Main {

	public static void main(String[] args) {

//		Circle obj1;
//		obj1 = new Circle(9);
//		obj1.setRadius(6);
//		System.out.println("Radius of the ball: " + obj1.getRadius());
//		System.out.println("Area of the ball: " + obj1.getArea());
//		System.out.println("Preimeter of the ball: " + obj1.getPerimeter());
//
//		Rectangle obj2;
//		obj2 = new Rectangle(5, 7);
//		obj2.setHeight(15);
//		obj2.setWidth(10);
//		System.out.println("Perimeter of the rectangle: " + obj2.getPerimeter());
//		System.out.println("Area of the rectangle: " + obj2.getArea());
//		System.out.println("Height of the rectangle: " + obj2.getHeight());
//		System.out.println("Width of rectangle: " + obj2.getWidth());
//
//	}
//
//}
		Rectangle obj;
		obj=new Rectangle();
		obj.setHeight(15.0);
		obj.setWidth(10.0);
		obj.getArea();
		obj.getPerimeter();
		
		Circle obj1;
		obj1=new Circle();
		obj1.setRadius(6);
		obj1.getArea();
		obj1.getPerimeter();
	}
}

You deleted a message

You  to  Everyone 10:54 AM
public class Circle implements Shape {
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
public interface Shape {
	double getArea();
	double getPerimeter();
}
public class Rectangle implements Shape {
	private double height;
	private double width;
public void setHeight(double height) {
			this.height = height;
		}
		public double getHeight() {
			return height;
		}
		
		public void setWidth(double width) {
			this.width = width;
		}
		public double getWidth() {
			return width;
		}
		@Override
		public double getArea() {
			System.out.println("Height of rectangle:"+height);
			System.out.println("Width of rectangle:"+ width);
			double Area;
			Area=width*height;
			System.out.println("Area of the rectangle:"+ Area);
			return Area;
		}
		@Override
		public double getPerimeter() {
			double Perimeter;
			Perimeter=2*(height+width);	
			System.out.println("Perimeter of the rectangle: "+Perimeter);
			return Perimeter;
	}

}
public class Main {

	public static void main(String[] args) {
Rectangle obj;
		obj=new Rectangle();
		obj.setHeight(15.0);
		obj.setWidth(10.0);
		obj.getArea();
		obj.getPerimeter();
		
		Circle obj1;
		obj1=new Circle();
		obj1.setRadius(6);
		obj1.getArea();
		obj1.getPerimeter();
	}
}

rosymurshalin  to  Everyone 11:13 AM
public class Main_Shape1 {
	public static void main(String[] args) {
		Rectangle obj;
		obj=new Rectangle();
		obj.setHeight(15.0);
		obj.setWidth(10.0);
		obj.getArea();
		obj.getPerimeter();
		
		Circle obj1;
		obj1=new Circle();
		obj1.setRadius(6);
		obj1.getArea();
		obj1.getPerimeter();		

	}

}
class Rectangle implements Shape{
	private double height;
	private double width;
	
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	public double getWidth() {
		return width;
	}
	@Override
	public double getArea() {
		System.out.println("Height of rectangle:"+height);
		System.out.println("width of rectangle:"+ width);
		double Area;
		Area=width*height;
		System.out.println("Area of the rectangle: "+ Area);
		return Area;
	}
	@Override
	public double getPerimeter() {
		double Perimeter;
		Perimeter=2*(height+width);	
		System.out.println("Perimeter of the rectangle: "+Perimeter);
		return Perimeter;
	}
}
class Circle implements Shape {
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
interface Shape {
	
	double getArea();
	double getPerimeter();
	
}

		