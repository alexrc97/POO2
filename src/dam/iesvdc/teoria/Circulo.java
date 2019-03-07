package dam.iesvdc.teoria;

public class Circulo {
	private double radio;
	public final static double PI = 3.141516;
	public static int numeroDeCirculos = 0;
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public Circulo(double radio) {
		super();
		this.radio = radio;
		numeroDeCirculos++;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}
	public double longitudCircunferencia () {
		return 2 * PI * radio;
	}
	public static double calcularAreaCirculoMayor (Circulo c1, Circulo c2) {
		if (c1.getRadio() > c2.getRadio()) {
			return PI * Math.pow(c1.getRadio(), 2);
		} else
			return PI * Math.pow(c2.getRadio(), 2);
	}
}
