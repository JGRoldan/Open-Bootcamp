package smartDevice;

public class SmartWatch extends SmartDevice{
	String pulsera;
	boolean Pulsaciones;
	
	public SmartWatch() {
	}

	public SmartWatch(
			boolean blueTooth,
			boolean wiFi,
	        String marca, 
	        String modelo, 
	        String color, 
	        int camara,
			String pulsera, 
			boolean pulsaciones) {
		super(blueTooth,wiFi,marca, modelo, color, camara);
		this.pulsera = pulsera;
		Pulsaciones = pulsaciones;
	}

	@Override
	public String toString() {
		return "SmartWatch pulsera=" + pulsera + ", Pulsaciones=" + Pulsaciones + ", blueTooth=" + blueTooth
				+ ", wiFi=" + wiFi + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", camara="
				+ camara;
	}

}
