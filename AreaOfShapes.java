package javaLab;

interface Shape {
	double getArea();
}


class Circle implements Shape {
	private double radius;
	
	Circle (double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
}

class Rectangle implements Shape {
	private double width, height;
	
	Rectangle (double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return width * height;
	}
}

public class AreaOfShapes {
	public static void main(String [] args) {
		Circle circle = new Circle(2);
		
		Rectangle rectangle = new Rectangle(4, 9);
		
		System.out.printf("%.2f\n", circle.getArea());
		System.out.println(rectangle.getArea());
	}
}