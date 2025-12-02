
public class Cliente {
	
	private int edad;
	private int freqViajes;
	private String tipViajero;
	private String prefClase;
	private String destino;
	private double dispFinanciera;
	private boolean viajarConNiños;
	
	public Cliente(int edad, int freqViajes, String tipViajero, String prefClase, String destino, double dispFinanciera,
			boolean viajarConNiños) {
		
		this.edad = edad;
		this.freqViajes = freqViajes;
		this.tipViajero = tipViajero;
		this.prefClase = prefClase;
		this.destino = destino;
		this.dispFinanciera = dispFinanciera;
		this.viajarConNiños = viajarConNiños;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getFreqViajes() {
		return freqViajes;
	}

	public void setFreqViajes(int freqViajes) {
		this.freqViajes = freqViajes;
	}

	public String getTipViajero() {
		return tipViajero;
	}

	public void setTipViajero(String tipViajero) {
		this.tipViajero = tipViajero;
	}

	public String getPrefClase() {
		return prefClase;
	}

	public void setPrefClase(String prefClase) {
		this.prefClase = prefClase;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public double getDispFinanciera() {
		return dispFinanciera;
	}

	public void setDispFinanciera(double dispFinanciera) {
		this.dispFinanciera = dispFinanciera;
	}

	public boolean isViajarConNiños() {
		return viajarConNiños;
	}

	public void setViajarConNiños(boolean viajarConNiños) {
		this.viajarConNiños = viajarConNiños;
	}

	@Override
	public String toString() {
		return "Cliente [edad=" + edad + ", freqViajes=" + freqViajes + ", tipViajero=" + tipViajero + ", prefClase="
				+ prefClase + ", destino=" + destino + ", dispFinanciera=" + dispFinanciera + ", viajarConNiños="
				+ viajarConNiños + "]";
	}
	
	
	

}
