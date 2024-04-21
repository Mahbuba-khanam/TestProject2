package quiz_16;

public class Rectangle implements Shape {
	private double height;
	private double width;

//	public Rectangle(double height, double width) {
//		super();
//		this.height = height;
//		this.width = width;
//	}
//
//	public double getHeight() {
//		double height;
//		height = 15;
//		return height;
//	}
//
//	public void setHeight(double height) {
//		this.height = height;
//	}
//
//	public double getWidth() {
//		double width;
//		width = 10;
//		return width;
//	}
//
//	public void setWidth(double width) {
//		this.width = width;
//	}
//
//	@Override
//	public double getArea() {
//		double area;
//		area  = height * width;	
//		return area;
//	}
//
//	@Override
//	public double getPerimeter() {
//
//		double perimeter;
//		perimeter = 2 * (height + width);
//		return perimeter;
	
		
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
