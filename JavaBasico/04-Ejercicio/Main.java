package smartDevice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartDevice samsung = new SmartPhone(true,true,"Samsung","S23","Negro",200,600,"Android");
    	System.out.println(samsung.toString());
    	
    	SmartDevice samsungSmartWatch = new SmartWatch(true,false,"Samsung","Galaxy Watch5 Small","Blanco",0,"Deportiva",true);
    	System.out.println(samsungSmartWatch.toString());
	}

}
