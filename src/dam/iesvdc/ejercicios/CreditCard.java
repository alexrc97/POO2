package dam.iesvdc.ejercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class CreditCard {
	private static final int NUMBER_OF_DIGITS = 16;
	private String creditNumber;
	private String TitularName;
	private LocalDate CreationDate = LocalDate.now();
	public CreditCard(String creditNumber, String titularName) {
		this.creditNumber = creditNumber;
		this.TitularName = titularName;
		//this.CreationDate = LocalDate.now(); posible opcion inicializar el objeto LocalDate dentro del constructor
	}
	public String getCreditNumber() {
		return creditNumber;
	}
	public void setCreditNumber(String creditNumber) {
		this.creditNumber = creditNumber;
	}
	public String getTitularName() {
		return TitularName;
	}
	public void setTitularName(String titularName) {
		TitularName = titularName;
	}
	public LocalDate getCreationDate() {
		return CreationDate;
	}
	@Override
	public String toString() {
		return String.format("Account holder: %S%n Nº Credit card: %s %n Expiration date: %s %n",
				TitularName,creditNumber,FormatDate(CreationDate.plusYears(4))); // si queremos trabajar 
		//de manera mas eficiente es mejor usar en el toString un Stringbuilder ya que solo
		//utiliza una posicion de memoria y no tiene que ir concatenando
	}
	private String FormatDate (LocalDate CreationDate) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("LL/yy");
		return getCreationDate().format(formatter);

	}
	public static boolean checkCreditNumber (String creditNumberToValidate) {
		if (!creditNumberToValidate.matches("[0-9]{" + NUMBER_OF_DIGITS + "}"))
			return false;
		class DigitControl {
			private String creditNumberWithoutDigitControl;

			public DigitControl(String creditNumberWithoutDigitControl) {
				this.creditNumberWithoutDigitControl = creditNumberWithoutDigitControl;
			}
			public String generateNumberWithDigitControl () {
				int DigitControl= generateDigitControl ();
				return creditNumberWithoutDigitControl+DigitControl;

			}
			private int generateDigitControl() {
				StringBuilder sBuilder = new StringBuilder(creditNumberWithoutDigitControl);
				String creditNWDCReverse = sBuilder.reverse().toString();
				int sum = 0;
				int partialValue;
				for (int i = 0; i < creditNWDCReverse.length(); i++) {
					if(i % 2 == 0) {
						partialValue = (creditNWDCReverse.charAt(i)-48)*2;
						if (partialValue > 9) {
							partialValue = (partialValue/10)+1;
						}
						else 
							partialValue = creditNWDCReverse.charAt(i)-48;
						sum += partialValue;
					}
				}
				return sum /10;
			}
		}		
		DigitControl dControl = new DigitControl (
				creditNumberToValidate.substring(0,NUMBER_OF_DIGITS-1));	
		return creditNumberToValidate.equalsIgnoreCase(dControl.generateNumberWithDigitControl());
	}

//	public static void main (String [] args){
//		CreditCard card = new CreditCard("1111111111111111","pepe");
//		System.out.println(card);
//		System.out.println("Tarjeta es valida " + CreditCard.checkCreditNumber(card.getCreditNumber()));
//	}
}
