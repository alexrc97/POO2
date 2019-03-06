package dam.iesvdc.teoria;

public class ClaseExternaConStatic {
	private int valorExterno;
	private static int atributoExterno;
	public ClaseExternaConStatic(int valorExterno) {
	
		this.valorExterno = valorExterno;
	}
	public int getValorExterno() {
		return valorExterno;
	}
	public static int devolverEnteroAleatorio () {
		return (int) Math.random()*100;
	}
	
	public static class ClaseInternaConStatic {
		private static String atributoInterna = "hola";
		private static String devolverAtributoInterno() {
			return atributoInterna + atributoExterno;
			
		}
//		public static int devolverAtributoExterno {
//			
//		}
	}
}
