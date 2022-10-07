package week1.day2.assgn;

public class TwoWheeler {
	
	public static void main(String[] args) {
		TwoWheeler obj = new TwoWheeler();
		
		int output = obj.noOfWheels();
		System.out.println("No of Wheels = " + output);
		
		short output1 = obj.noOfMirrors();
		System.out.println("No of Mirrors = " + output1);
		
		long output2 = obj.chassisNumber();
		System.out.println("Chassis Number = " + output2);
		
		boolean output3 = obj.ispuncture();
		System.out.println("Is Puncture = " + output3);
		
		String output4 = obj.bikename();
		System.out.println("Bike Name = " + output4);
		
		double output5 = obj.runningkm();
		System.out.println("Running KM = " + output5);
		
		
	}

	
	public int noOfWheels() {
			int number =4;
			return number;
	}
	public short noOfMirrors() {
		short number = 4;
		return number;
		
	}
	public long chassisNumber() {
		long number = 9567789654L;
		return number;
	}
	public boolean ispuncture() {
		boolean ispuncture = true;
		return ispuncture;
	}
	public String bikename() {
		String name = "TVS";
		return name;
	}
		
	public double 	runningkm() {
		double number = 80000;
		return number;
	}

}
