package dam.iesvdc.ejercicios;

public class Rectangle {
	private double width;
	private double heigth;
	private static int rectangelNumber = 0;
	
	public Rectangle(double width, double heigth) {
		this.width = width;
		this.heigth = heigth;
		rectangelNumber++;
	}
	
	public Rectangle() {
//		this.width = 1;
//		this.heigth = 1;
		this(1.0,1.0); //esta es la forma mas sencilla de inicializar un constructor por defecto 
		//es como si llamara al verdadero constructor y lo hiciera con los valores que se le pasen en el this.
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", heigth=" + heigth + "]";
	}
	
	public static int getRectangelNumber() {
		return rectangelNumber;
	}
	
	public static class ClassNumberOfRectangle {
		public static int getRectangelNumber() {
			return rectangelNumber;
		}
	}
	public double getArea () {
		return width * heigth;
	}
	public double getPerimeter () {
		return (width+heigth) * 2.0 ;
	}
	
}
