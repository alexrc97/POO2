package dam.iesvdc.ejercicios;

public class testRectangle {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		Rectangle rectangle2 = new Rectangle(2.1,6.3);
		System.out.println(rectangle);
		System.out.println(rectangle2);
		System.out.printf("Number of rectangles %d%n",Rectangle.getRectangelNumber());
		System.out.printf("Number of rectangles %d%n",Rectangle.ClassNumberOfRectangle.getRectangelNumber());
		System.out.printf("Area of the rectangle %f%n" , rectangle.getArea());
		System.out.printf("Perimeter of the rectangle %f%n" , rectangle.getPerimeter());

		
	}

}
