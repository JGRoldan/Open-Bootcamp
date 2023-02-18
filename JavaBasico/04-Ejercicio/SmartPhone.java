package smartDevice;

public class SmartPhone extends SmartDevice{
	int ram;
    String SO;

    public SmartPhone(){
    }

    public SmartPhone(
    		boolean blueTooth,
    		boolean wiFi,
    		String marca, 
    		String modelo, 
    		String color, 
    		int camara, 
    		int ram, 
    		String SO){
    	
        super(blueTooth,wiFi,marca, modelo, color, camara);
        this.ram = ram;
        this.SO = SO;
    }

	@Override
	public String toString() {
		return "SmartPhone ram=" + ram + ", SO=" + SO + ", blueTooth=" + blueTooth + ", wiFi=" + wiFi + ", marca="
				+ marca + ", modelo=" + modelo + ", color=" + color + ", camara=" + camara;
	}
}
