//package com.iesvirgendelcarmen.POO2.teoria;
//
//public class TestClasesAnidadasStatic {
//
//	public static void main(String[] args) {
//		System.out.println("Valor aleatorio" + ClaseExternaConStatic.devolverEnteroAleatorio());
//		ClaseExternaConStatic c = new ClaseExternaConStatic(5);
//		System.out.println("Valor del atributo externo" + c.getValorExterno());
//		System.out.println("Valor del atributo interno" + c.gdevolverValorEstaticoInterno);//mala praxis porque el metodo es estatico
//	
//		ClaseExternaConStatic.ClaseInternaConStatic ce =
//				new ClaseExternaConStatic.ClaseInternaConStatic();
//		System.out.println("Valor externo"+ ce.devolverAtributoExterno());//mala praxis
//		System.out.println("Valor interno"+ ce.devolverAtributoInterno());//mala praxis
//		
//		System.out.println("Valor externo" + ClaseExternaConStatic.ClaseInternaConStatic.devolverAtributoExterno());
//		System.out.println("Valor interno" + ClaseExternaConStatic.ClaseInternaConStatic.devolverAtributoInterno());
//
//	}
//
//}
