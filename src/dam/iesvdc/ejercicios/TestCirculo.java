package dam.iesvdc.ejercicios;

public class TestCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo c1 = new Circulo (12.3);
		Circulo c2 = new Circulo (10);
		System.out.println(c1);
		System.out.println(c2);
		System.out.printf("La longitud de la circunferencia c1 es: %.2f%n",c1.longitudCircunferencia());
		System.out.printf("El radio de c2 es: %.2f%n",c2.getRadio());
		System.out.printf("El circulo de mayor area es: %.2f%n",Circulo.calcularAreaCirculoMayor(c1, c2));
		System.out.println("Numero de circulos" + Circulo.numeroDeCirculos);
	}

}
