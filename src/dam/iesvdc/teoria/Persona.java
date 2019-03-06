package dam.iesvdc.teoria;

import java.time.LocalDate;
import java.time.Period;


public class Persona {
	private String nombrePersona ;
	private String dni;
	private LocalDate fecha_nac;
	public Persona(String nombrePersona, String dni, LocalDate fecha_nac) {
		super();
		this.nombrePersona = nombrePersona;
		this.dni = dni;
		this.fecha_nac = fecha_nac;
	}
	public String getNombrePersona() {
		return nombrePersona;
	}
	public String getDni() {
		return dni;
	}
	public LocalDate getFecha_nac() {
		return fecha_nac;
	}
	@Override
	public String toString() {
		return nombrePersona + "," + dni + "," + CalcularAnnosTranscurrido(fecha_nac) + " años";
	}
	public static int CalcularAnnosTranscurrido (LocalDate fecha) {
		Period period = Period.between(fecha, LocalDate.now());
		
		return -period.getYears();
		
	}
	public static void main ( String [] agrs ) {
		 Persona p = new Persona("Federico", "dni", LocalDate.parse("2000-10-10"));
		 System.out.println(p);
	}
}
