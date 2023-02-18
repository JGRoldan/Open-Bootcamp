package smartDevice;

public class SmartDevice {
		boolean blueTooth;
		boolean wiFi;
	    String marca;
	    String modelo;
	    String color;
	    int camara;
		
	    public SmartDevice(){
	    }

	    public SmartDevice(boolean blueTooth,boolean wiFi,String marca, String modelo, String color, int camara){
	    	this.blueTooth = blueTooth;
	    	this.wiFi = wiFi;
	        this.marca = marca;
	        this.modelo = modelo;
	        this.color = color;
	        this.camara = camara;
	    }
}
