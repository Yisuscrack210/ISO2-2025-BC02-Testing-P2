import java.util.*;

public class determinarTarifa {

	private String asignarTarifa(Cliente c) {
		String tipoTarifa = "";
		double costeVuelo = 50;
		double descuento = 0.0;
		
		if(c.getEdad()<18 && c.getFreqViajes()>=6) {
			tipoTarifa = "Pajarillo";
			descuento = 0.1;
		}
		
		if(c.getEdad()>=18 || c.getEdad()<=25) {
			if(c.getTipViajero().equals("Estudiante") && c.getPrefClase().equals("Turista") && c.getFreqViajes()>=9) {
				tipoTarifa = "Gorrión";
				descuento = 0.15;
			}
		}
	
		if(c.getEdad()>=18 || c.getEdad()<=25) {
			if(c.getPrefClase().equals("Turista") && c.getFreqViajes()>=3) {
				if(c.getTipViajero().contains("Vive con padres")) {
					tipoTarifa = "Viaja ahora que puedes";
					descuento = 0.05;
				}
				else if(c.getTipViajero().contains("Independiente")) {
					tipoTarifa = "Atreviendose a saltar del Nido";
					descuento = 0.25;
				}
			}
		}
		
		if(c.getEdad()>25 && c.getDispFinanciera()>20000 && c.getDispFinanciera()<35000 && c.getFreqViajes()>=6) {
			if(c.getPrefClase().equals("Turista") && c.getDestino().equals("Europa")) {
				if(c.isViajarConNiños()==false) {
					tipoTarifa = "Conoce Europa";
					descuento = 0.15;
				}
				else if(c.isViajarConNiños()==true) {
					tipoTarifa = "Conoce Europa con tus peques";
					descuento = 0.10;
				}
			}
	
		}
		
		if(c.getEdad()>25 && c.getDispFinanciera()>35000 && c.getFreqViajes()>=6) {
			if(c.getPrefClase().equals("Business") && c.getDestino().equals("Asia") || c.getDestino().equals("America")) {
				if(c.isViajarConNiños()==false) {
					tipoTarifa = "Conoce el Mundo";
					descuento = 0.2;
				}
				else if (c.isViajarConNiños()==true) {
					tipoTarifa = "Conoce el Mundo con tus peques";
					descuento = 0.1;
				}
			}
		}
		return tipoTarifa;
			
	}
	public static void main(String[] args) {
		determinarTarifa tarifa = new determinarTarifa();
		String tipoTarifa = "";
		
		Cliente pajarillo = new Cliente(15, 8, "Menor", "Turista", "Europa", 0.0, false);
		tipoTarifa = tarifa.asignarTarifa(pajarillo);
		System.out.println("TIPO DE TARIFA APLICADA: "+ tipoTarifa +"\n");
		
		Cliente gorrion = new Cliente(22, 10, "Estudiante", "Turista", "Europa", 5000.0, false);
		tipoTarifa = tarifa.asignarTarifa(gorrion);
		System.out.println("TIPO DE TARIFA APLICADA: "+ tipoTarifa +"\n");

		Cliente trabajadorConPadres = new Cliente(24, 4, "Trabajador - Vive con padres", "Turista", "Europa", 15000.0, false);
		tipoTarifa = tarifa.asignarTarifa(trabajadorConPadres);
		System.out.println("TIPO DE TARIFA APLICADA: "+ tipoTarifa +"\n");
		
		Cliente adultoConNiños = new Cliente(40, 7, "Adulto", "Turista", "Europa", 30000.0, true);
		tipoTarifa = tarifa.asignarTarifa(adultoConNiños);
		System.out.println("TIPO DE TARIFA APLICADA: "+ tipoTarifa +"\n");
		
		Cliente adultoBusiness = new Cliente(55, 6, "Adulto", "Business", "Asia", 40000.0, false);
		tipoTarifa = tarifa.asignarTarifa(adultoBusiness);
		System.out.println("TIPO DE TARIFA APLICADA: "+ tipoTarifa +"\n");
		

	}

}
